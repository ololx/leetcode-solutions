package io.github.ololx.leetcode.solutions.medium.task677;

import java.util.HashMap;
import java.util.Map;

/**
 * 677. Map Sum Pairs
 *
 * Design a map that allows you to do the following:
 * <ol>
 *     <li>
 *         Maps a string key to a given value.
 *     </li>
 *     <li>
 *         Returns the sum of the values that have a key with a prefix equal to a given string.
 *     </li>
 * </ol>
 *
 * Implement the MapSum class:
 * <ol>
 *     <li>
 *         MapSum() Initializes the MapSum object.
 *     </li>
 *     <li>
 *         void insert(String key, int val) Inserts the key-val pair into
 *         the map. If the key already existed, the original key-value pair
 *         will be overridden to the new one.
 *     </li>
 *     <li>
 *         int sum(string prefix) Returns the sum of all the pairs' value
 *         whose key starts with the prefix.
 *     </li>
 * </ol>
 *
 * Example 1:
 * <p>Input
 * ["MapSum", "insert", "sum", "insert", "sum"]
 * [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * Output
 * [null, null, 3, null, 5]
 *
 * Explanation
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= key.length, prefix.length <= 50
 *     </li>
 *     <li>
 *         key and prefix consist of only lowercase English letters.
 *     </li>
 *     <li>
 *         1 <= val <= 1000
 *     </li>
 *     <li>
 *         At most 50 calls will be made to insert and sum.
 *     </li>
 * </ul>
 *
 * @apiNote
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 *
 * project leetcode-solutions
 * created 01.02.2023 19:52
 * <p>
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class MapSum {

        private final Map<String, Integer> values = new HashMap<>();

        private final Map<String, Integer> valuesSumsForPrefixes = new HashMap<>();

        public MapSum() {}

        public void insert(String key, int val) {
            // remove and get stored value
            Integer storedValue = this.values.remove(key);
            this.values.put(key, val);
            // calc sum for each key prefix sum = sum + (val - storedValue)
            // if storedValue was not exist, then sum = sum + val
            this.calcPrefixesSum(key, storedValue != null ? val - storedValue : val);
        }

        private void calcPrefixesSum(String key, int val) {
            for (int prefixLength = 1; prefixLength <= key.length(); prefixLength++) {
                String prefix = key.substring(0, prefixLength);
                int currentSum = this.valuesSumsForPrefixes.getOrDefault(prefix, 0);
                this.valuesSumsForPrefixes.put(prefix, currentSum + val);
            }
        }

        public int sum(String prefix) {
            return this.valuesSumsForPrefixes.getOrDefault(prefix, 0);
        }
    }
}
