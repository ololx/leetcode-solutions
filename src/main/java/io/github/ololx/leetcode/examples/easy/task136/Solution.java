package io.github.ololx.leetcode.examples.easy.task136;

import java.util.HashMap;
import java.util.Map;

/**
 * 136. Single Number
 *
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 *
 * Example 1:
 * <p>Input: nums = [2,2,1]
 * Output: 1</p>
 *
 * Example 2:
 * <p>Input: nums = [4,1,2,1,2]
 * Output: 4</p>
 *
 * Example 3:
 * <p>Input: nums = [1]
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 3 * 10^4
 *      </li>
 *      <li>
 *          -3 * 10^4 <= nums[i] <= 3 * 10^4
 *      </li>
 *      <li>
 *          Each element in the array appears twice except for
 *          one element which appears only once.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 15.02.2022 10:16
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, 1 + numMap.getOrDefault(num, 0));

            if (numMap.get(num) >= 2) {
                numMap.remove(num);
            }
        }

        return numMap.keySet().iterator().next();
    }
}
