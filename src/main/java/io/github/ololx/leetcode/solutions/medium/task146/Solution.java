package io.github.ololx.leetcode.solutions.medium.task146;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 *
 * Design a data structure that follows the constraints of a Least Recently
 * Used (LRU) cache.
 *
 * Implement the LRUCache class:
 * <ol>
 *     <lo>
 *         LRUCache(int capacity) Initialize the LRU cache with positive
 *         size capacity.
 *     </lo>
 *     <lo>
 *         int get(int key) Return the value of the key if the key exists,
 *         otherwise return -1.
 *     </lo>
 *     <li>
 *         void put(int key, int value) Update the value of the key if
 *         the key exists. Otherwise, add the key-value pair to the cache.
 *         If the number of keys exceeds the capacity from this operation,
 *         evict the least recently used key.
 *     </li>
 *     <li>
 *         The functions get and put must each run in O(1) average
 *         time complexity.
 *     </li>
 * </ol>
 *
 * Example 1:
 * <p>Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * Output
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 *
 * Explanation
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // returns -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= capacity <= 3000
 *     </li>
 *     <li>
 *         0 <= key <= 10^4
 *     </li>
 *     <li>
 *         0 <= value <= 10^5
 *     </li>
 *     <li>
 *         At most 2 * 105 calls will be made to get and put.
 *     </li>
 * </ul>
 *
 * @apiNote
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 *
 * project leetcode-solutions
 * created 29.01.2023 15:45
 * <p>
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class LRUCache {

        private final Map<Integer, CachedNode<Integer, Integer>> elements;

        private CachedNode<Integer, Integer> head = new CachedNode<>(null, null);

        private CachedNode<Integer, Integer> tail = new CachedNode<>(null, null);

        private final int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.elements = new HashMap<>(capacity);
            this.head.next = this.tail;
            this.tail.previous = this.head;
        }

        public int get(int key) {
            CachedNode<Integer, Integer> currentNode = this.elements.get(key);
            if (currentNode == null) {
                return -1;
            }

            moveNodeToHead(currentNode);

            return currentNode.value;
        }

        private void moveNodeToHead(CachedNode<Integer, Integer> node) {
            CachedNode<Integer, Integer> previousNode = node.previous;
            CachedNode<Integer, Integer> nextNode = node.next;
            nextNode.previous = node.previous;
            previousNode.next = node.next;

            CachedNode<Integer, Integer> recentlyUsedNode = this.head.next;
            node.next = recentlyUsedNode;
            recentlyUsedNode.previous = node;

            node.previous = this.head;
            this.head.next = node;
        }

        public void put(int key, int value) {
            if (this.elements.containsKey(key)) {
                CachedNode<Integer, Integer> currentNode = this.elements.remove(key);
                removeNode(currentNode);
            } else if (this.capacity == this.elements.size()) {
                CachedNode<Integer, Integer> lastUsedNode = this.tail.previous;
                removeNode(lastUsedNode);
                this.elements.remove(lastUsedNode.key);
            }

            CachedNode<Integer, Integer> cachedNode = new CachedNode<>(key, value, this.head, this.head.next);
            this.head.next.previous = cachedNode;
            this.head.next = cachedNode;
            this.elements.put(key, cachedNode);
        }

        private void removeNode(CachedNode<Integer, Integer> node) {
            CachedNode<Integer, Integer> previousNode = node.previous;
            CachedNode<Integer, Integer> nextNode = node.next;
            nextNode.previous = node.previous;
            previousNode.next = node.next;
        }

        private class CachedNode<K, V> {

            private final K key;

            private final V value;

            private CachedNode<K, V> next;

            private CachedNode<K, V> previous;

            CachedNode(K key, V value) {
                this(key, value, null, null);
            }

            CachedNode(K key, V value, CachedNode<K, V> previous, CachedNode<K, V> next) {
                this.key = key;
                this.value = value;
                this.next = next;
                this.previous = previous;
            }
        }
    }
}
