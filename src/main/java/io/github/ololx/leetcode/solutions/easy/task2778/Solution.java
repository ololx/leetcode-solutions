package io.github.ololx.leetcode.solutions.easy.task2778;

/**
 * 2778. Sum of Squares of Special Elements
 * <p>
 * You are given a 1-indexed integer array nums of length n.
 * An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.
 * Return the sum of the squares of all special elements of nums.
 * <p>
 * Example 1:
 * <p>Input: nums = [1,2,3,4]
 * Output: 21
 * Explanation: There are exactly 3 special elements in nums: nums[1] since 1 divides 4,
 * nums[2] since 2 divides 4, and nums[4] since 4 divides 4.
 * Hence, the sum of the squares of all special elements of nums is nums[1] * nums[1] +
 * nums[2] * nums[2] + nums[4] * nums[4] = 1 * 1 + 2 * 2 + 4 * 4 = 21.</p>
 * <p>
 * Example 2:
 * <p>Input: nums = [2,7,1,19,18,3]
 * Output: 63
 * Explanation: There are exactly 4 special elements in nums: nums[1] since 1 divides 6,
 * nums[2] since 2 divides 6, nums[3] since 3 divides 6, and nums[6] since 6 divides 6.
 * Hence, the sum of the squares of all special elements of nums is nums[1] * nums[1] + nums[2]
 * * nums[2] + nums[3] * nums[3] + nums[6] * nums[6] = 2 * 2 + 7 * 7 + 1 * 1 + 3 * 3 = 63. </p>
 * <p>
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length == n <= 50
 *      </li>
 *      <li>
 *          1 <= nums[i] <= 50
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 02.08.2023 21:19
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sumOfSquares = 0;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sumOfSquares += nums[i] * nums[i];
            }
        }

        return sumOfSquares;
    }
}
