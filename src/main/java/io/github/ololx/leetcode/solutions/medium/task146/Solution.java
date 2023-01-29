package io.github.ololx.leetcode.solutions.medium.task146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 146. LRU Cache
 *
 * project leetcode-solutions
 * created 29.01.2023 15:45
 * <p>
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class LRUCache {

        private final Map<Integer, Integer> elements;

        private final LinkedList<Integer> keys;

        private final int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.elements = new HashMap<>(capacity);
            this.keys = new LinkedList<>();
        }

        public int get(int key) {
            Integer value = this.elements.get(key);
            if (value == null) {
                return -1;
            }

            return value;
        }

        public void put(int key, int value) {
            if (this.elements.size() == this.capacity) {
                this.elements.remove(this.keys.removeLast());
            }

            this.keys.add(key);
            this.elements.put(key, value);
        }
    }
}
