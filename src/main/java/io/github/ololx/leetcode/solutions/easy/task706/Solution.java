package io.github.ololx.leetcode.solutions.easy.task706;

import java.util.Arrays;

/**
 * 706. Design HashMap
 *
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 * <ul>
 *      <li>
 *          MyHashMap() initializes the object with an empty map.
 *      </li>
 *      <li>
 *          void put(int key, int value) inserts a (key, value) pair into the HashMap.
 *          If the key already exists in the map, update the corresponding value.
 *      </li>
 *      <li>
 *          int get(int key) returns the value to which the specified key is mapped,
 *          or -1 if this map contains no mapping for the key.
 *      </li>
 *      <li>
 *          void remove(key) removes the key and its corresponding value
 *          if the map contains the mapping for the key.
 *      </li>
 * </ul>
 *
 * Example 1:
 * <p>Input
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * Output
 * [null, null, null, 1, -1, null, 1, null, -1]
 *
 * Explanation
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= key, value <= 10^6
 *      </li>
 *      <li>
 *          At most 10^4 calls will be made to put, get, and remove.
 *      </li>
 * </ul>
 */
public class Solution {

    public static class MyHashMap {

        private int size = 0;

        private int[] values;

        public MyHashMap() {
            this.values = new int[size];
        }

        public void put(int key, int value) {
            if (key >= this.size) {
                int newSize = key + 1;
                int[] newValues = new int[newSize];
                Arrays.fill(newValues, -1);

                System.arraycopy(this.values, 0, newValues, 0, this.size);

                this.values = newValues;
                this.size = newSize;
            }

            this.values[key] = value;
        }

        public int get(int key) {
            if (key >= this.size) {
                return -1;
            }

            return this.values[key];
        }

        public void remove(int key) {
            if (key >= this.size) {
                return;
            }

            this.values[key] = -1;
        }
    }
}
