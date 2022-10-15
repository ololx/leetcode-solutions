package io.github.ololx.leetcode.solutions.easy.task169;

import java.util.Arrays;

/**
 * 169. Majority Element
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Example 1:
 * <p>Input: nums = [3,2,3]
 * Output: 3</p>
 *
 * Example 2:
 * <p>Input: nums = [2,2,1,1,1,2,2]
 * Output: 2</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          n == nums.length
 *      </li>
 *      <li>
 *          1 <= n <= 5 * 10^4
 *      </li>
 *      <li>
 *          -10^9 <= nums[i] <= 10^9
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 12.09.2022 12:43
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}
