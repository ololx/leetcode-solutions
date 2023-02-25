package io.github.ololx.leetcode.solutions.hard.task460;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * 460. LFU Cache
 *
 * Design and implement a data structure for a Least Frequently Used (LFU) cache.
 * Implement the LFUCache class:
 * <ul>
 *     <li>
 *         LFUCache(int capacity) Initializes the object with the capacity of the data structure.
 *     </li>
 *     <li>
 *         int get(int key) Gets the value of the key if the key exists in the cache.
 *         Otherwise, returns -1.
 *     </li>
 *     <li>
 *         void put(int key, int value) Update the value of the key if present,
 *         or inserts the key if not already present. When the cache reaches its capacity,
 *         it should invalidate and remove the least frequently used key before inserting
 *         a new item. For this problem, when there is a tie (i.e., two or more keys with
 *         the same frequency), the least recently used key would be invalidated.
 *     </li>
 * </ul>
 *
 * To determine the least frequently used key, a use counter is maintained for each key
 * in the cache. The key with the smallest use counter is the least frequently used key.
 *
 * When a key is first inserted into the cache, its use counter is set to 1 (due to the
 * put operation). The use counter for a key in the cache is incremented either a get or
 * put operation is called on it.
 *
 * The functions get and put must each run in O(1) average time complexity.
 *
 * Example 1:
 * <p>Input
 * ["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
 * Output
 * [null, null, null, 1, null, -1, 3, null, -1, 3, 4]
 *
 * Explanation
 * // cnt(x) = the use counter for key x
 * // cache=[] will show the last used order for tiebreakers (leftmost element is  most recent)
 * LFUCache lfu = new LFUCache(2);
 * lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
 * lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
 * lfu.get(1);      // return 1
 *                  // cache=[1,2], cnt(2)=1, cnt(1)=2
 * lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
 *                  // cache=[3,1], cnt(3)=1, cnt(1)=2
 * lfu.get(2);      // return -1 (not found)
 * lfu.get(3);      // return 3
 *                  // cache=[3,1], cnt(3)=2, cnt(1)=2
 * lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
 *                  // cache=[4,3], cnt(4)=1, cnt(3)=2
 * lfu.get(1);      // return -1 (not found)
 * lfu.get(3);      // return 3
 *                  // cache=[3,4], cnt(4)=1, cnt(3)=3
 * lfu.get(4);      // return 4
 *                  // cache=[4,3], cnt(4)=2, cnt(3)=3</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= capacity <= 10^4
 *      </li>
 *      <li>
 *          0 <= key <= 10^5
 *      </li>
 *      <li>
 *          0 <= value <= 10^9
 *      </li>
 *      <li>
 *          At most 2 * 10^5 calls will be made to get and put.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 25.02.2023 12:18
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class LFUCache {

        // map for all elements
        private final Map<Integer, CachedElement<Integer, Integer>> elements;

        // sorted map for elements grouped by frequencies and querying by frequency
        private final TreeMap<Integer, LinkedList<Integer>> frequencies = new TreeMap<>();

        // capacity of cache
        private final int capacity;

        public LFUCache(int capacity) {
            this.capacity = capacity;
            this.elements = new HashMap<>(capacity);
        }

        public int get(int key) {
            CachedElement<Integer, Integer> element = this.elements.get(key);
            if (element == null) {
                return -1;
            }

            incrementFrequency(element);

            return element.value;
        }

        public void put(int key, int value) {
            if (!this.elements.containsKey(key) && this.capacity == this.elements.size()) {
                this.removeLFU();
            }

            CachedElement<Integer, Integer> element = this.elements.get(key);
            if (element == null) {
                element = new CachedElement<>(key, value);
                this.addNew(element);
            } else {
                element.value = value;
                incrementFrequency(element);
            }

            this.elements.put(key, element);
        }

        private void addNew(CachedElement<Integer, Integer> element) {
            LinkedList<Integer> elementsOfOneFrequency = this.frequencies.getOrDefault(
                    element.accessCount,
                    new LinkedList<>()
            );
            elementsOfOneFrequency.addFirst(element.key);

            this.frequencies.put(element.accessCount, elementsOfOneFrequency);
        }

        private void removeLFU() {
            int elementsOfMinFrequencyKey = frequencies.firstKey();
            LinkedList<Integer> elementsOfMinFrequency = frequencies.remove(elementsOfMinFrequencyKey);
            int lfuKey = elementsOfMinFrequency.removeLast();

            if (!elementsOfMinFrequency.isEmpty()) {
                this.frequencies.put(elementsOfMinFrequencyKey, elementsOfMinFrequency);
            }

            this.elements.remove(lfuKey);
        }

        private void incrementFrequency(CachedElement<Integer, Integer> element) {
            LinkedList<Integer> elementsOfCurrentFrequency = this.frequencies.remove(element.accessCount);
            elementsOfCurrentFrequency.remove(element.key);

            if (!elementsOfCurrentFrequency.isEmpty()) {
                this.frequencies.put(element.accessCount, elementsOfCurrentFrequency);
            }

            element.accessCount++;

            LinkedList<Integer> elementsOfHigherFrequency = this.frequencies.getOrDefault(
                    element.accessCount,
                    new LinkedList<>()
            );
            elementsOfHigherFrequency.addFirst(element.key);
            this.frequencies.put(element.accessCount, elementsOfHigherFrequency);
        }

        private static class CachedElement<K, V> {

            private final K key;

            private V value;

            private int accessCount;

            CachedElement(K key, V value) {
                this.key = key;
                this.value = value;
                this.accessCount = 1;
            }
        }
    }
}
