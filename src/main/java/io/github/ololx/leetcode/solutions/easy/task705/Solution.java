package io.github.ololx.leetcode.solutions.easy.task705;

/**
 * 705. Design HashSet
 *
 * Design a HashSet without using any built-in hash table libraries.
 *
 * Implement MyHashSet class:
 * <ul>
 *      <li>
 *          void add(key) Inserts the value key into the HashSet.
 *      </li>
 *      <li>
 *          bool contains(key) Returns whether the value key exists in the HashSet or not.
 *      </li>
 *      <li>
 *          void remove(key) Removes the value key in the HashSet.
 *          If key does not exist in the HashSet, do nothing.
 *      </li>
 * </ul>
 *
 * Example 1:
 * <p>Input
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * Output
 * [null, null, null, true, false, null, true, null, false]
 *
 * Explanation
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return True
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return False, (already removed)</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= key, value <= 10^6
 *      </li>
 *      <li>
 *          At most 10^4 calls will be made to add, remove, and contains.
 *      </li>
 * </ul>
 */
public class Solution {

    public static class MyHashSet {

        private int size = 0;

        private int[] values;

        public MyHashSet() {
            this.values = new int[size];
        }

        public void add(int key) {
            if (key >= this.size) {
                int newSize = key + 1;
                int[] newValues = new int[newSize];

                System.arraycopy(this.values, 0, newValues, 0, this.size);

                this.values = newValues;
                this.size = newSize;
            }

            this.values[key] = 1;
        }

        public void remove(int key) {
            if (key >= this.size) {
                return;
            }

            this.values[key] = 0;
        }

        public boolean contains(int key) {
            if (key >= this.size) {
                return false;
            }

            return this.values[key] == 1;
        }
    }
}
