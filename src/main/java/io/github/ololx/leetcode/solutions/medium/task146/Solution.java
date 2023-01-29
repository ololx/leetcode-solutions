package io.github.ololx.leetcode.solutions.medium.task146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 146. LRU Cache
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
