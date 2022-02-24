package io.github.ololx.leetcode.examples.easy.task1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * <p>Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].</p>
 *
 * Example 2:
 * <p>Input: nums = [3,2,4], target = 6
 * Output: [1,2]</p>
 *
 * Example 3:
 * <p>Input: nums = [3,3], target = 6
 * Output: [0,1]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         2 <= nums.length <= 1^04
 *     </li>
 *     <li>
 *         -10^9 <= nums[i] <= 10^9
 *     </li>
 *     <li>
 *         -10^9 <= target <= 10^9
 *     </li>
 *     <li>
 *         Only one valid answer exists.
 *     </li>
 * </ul>
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 *
 * project leetcode-solutions
 * created 24.02.2022 21:20
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mediator = new HashMap<>();

        for (int i = 0 ; i <= nums.length; i++) {
            if (mediator.containsKey(target - nums[i])) {
                return new int[]{mediator.get(target - nums[i]), i};
            }

            mediator.put(nums[i], i);
        }

        return null;
    }
}
