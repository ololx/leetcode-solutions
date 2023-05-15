package io.github.ololx.leetcode.solutions.medium.task260;

/**
 * 260. Single Number III
 *
 * Given an integer array nums, in which exactly two elements appear only once
 * and all the other elements appear exactly twice. Find the two elements that
 * \appear only once. You can return the answer in any order.
 *
 * You must write an algorithm that runs in linear runtime complexity and uses
 * only constant extra space.
 *
 * Example 1:
 * <p>Input: nums = [1,2,1,3,2,5]
 * Output: [3,5]
 * Explanation:  [5, 3] is also a valid answer.</p>
 *
 * Example 2:
 * <p>Input: nums = [-1,0]
 * Output: [-1,0]</p>
 *
 * Example 3:
 * <p>Input: nums = [0,1]
 * Output: [1,0]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= nums.length <= 3 * 104
 *      </li>
 *      <li>
 *          -2^31 <= nums[i] <= 2^30
 *      </li>
 *      <li>
 *          Each integer in nums will appear twice, only two integers will appear once.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 15.05.2023 12:48
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] singleNumber(int[] nums) {
        int singleNumbersBits = 0;

        for (int num : nums) {
            singleNumbersBits ^= num;
        }

        int lsb = singleNumbersBits & (-singleNumbersBits);
        int[] singleNumbers = new int[2];

        for (int num : nums) {
            if ((num & lsb) != 0) {
                singleNumbers[0] ^= num;
            } else {
                singleNumbers[1] ^= num;
            }
        }

        return singleNumbers;
    }
}
