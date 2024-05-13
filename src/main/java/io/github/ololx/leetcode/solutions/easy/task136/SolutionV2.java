package io.github.ololx.leetcode.solutions.easy.task136;

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
 * created 12.05.2022 21:07
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public int singleNumber(int[] nums) {

        int singleNumber = 0;

        for (int num : nums) {
            singleNumber ^= num;
        }

        return singleNumber;
    }
}
