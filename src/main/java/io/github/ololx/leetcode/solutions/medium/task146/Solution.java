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

        private final int capacity;

        private final Map<Integer, CachedNode<Integer, Integer>> elements;

        private CachedNode<Integer, Integer> head = new CachedNode<>(null, null);

        private CachedNode<Integer, Integer> tail = new CachedNode<>(null, null);

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.elements = new HashMap<>(capacity);
            this.head.next = this.tail;
            this.tail.previous = this.head;
        }

        public int get(int key) {
            CachedNode<Integer, Integer> mruNode = this.elements.get(key);
            if (mruNode == null) {
                return -1;
            }

            mruNode.next.previous = mruNode.previous;
            mruNode.previous.next = mruNode.next;

            mruNode.next = this.head.next;
            mruNode.previous = this.head;
            this.head.next.previous = mruNode;
            this.head.next = mruNode;

            return mruNode.value;
        }

        public void put(int key, int value) {
            if (this.elements.size() == this.capacity) {
                CachedNode<Integer, Integer> lruNode = this.tail.previous;
                this.tail.previous = lruNode.previous;
                lruNode.previous.next = lruNode.previous;
                this.elements.remove(lruNode.key);
            }

            CachedNode<Integer, Integer> cachedNode = new CachedNode<>(key, value, this.head, this.head.next);
            this.head.next.previous = cachedNode;
            this.head.next = cachedNode;
            this.elements.put(key, cachedNode);
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
