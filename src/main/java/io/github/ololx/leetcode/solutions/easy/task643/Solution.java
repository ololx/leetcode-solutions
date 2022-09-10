package io.github.ololx.leetcode.solutions.easy.task643;

/**
 * 643. Maximum Average Subarray I
 *
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the
 * maximum average value and return this value. Any answer with
 * a calculation error less than 10^-5 will be accepted.
 *
 * Example1:
 * <p>Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75</p>
 *
 * Example2:
 * <p>Input: nums = [5], k = 1
 * Output: 5.00000</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         n == nums.length
 *     </li>
 *     <li>
 *         1 <= k <= n <= 10^5
 *     </li>
 *     <li>
 *         -10^4 <= nums[i] <= 10^4
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 29.06.2022 14:24
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        double currAvg = .0, maxAvg = .0;

        for (int numIndex = 0; numIndex < nums.length; numIndex++) {
            if (numIndex < k) {
                maxAvg = currAvg += nums[numIndex] / (double) k;
                continue;
            }

            currAvg = currAvg - nums[numIndex - k] / (double) k + nums[numIndex] / (double) k;

            if (currAvg > maxAvg) {
                maxAvg = currAvg;
            }
        }

        return maxAvg;
    }
}
