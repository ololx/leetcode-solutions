package io.github.ololx.leetcode.solutions.medium.task2090;

/**
 * 2090. K Radius Subarray Averages
 *
 * You are given a 0-indexed array nums of n integers, and an integer k.
 *
 * The k-radius average for a subarray of nums centered at some index i with the
 * radius k is the average of all elements in nums between the indices i - k
 * and i + k (inclusive). If there are less than k elements before or after the
 * index i, then the k-radius average is -1.
 *
 * Build and return an array avgs of length n where avgs[i] is the k-radius average for
 * the subarray centered at index i.
 *
 * The average of x elements is the sum of the x elements divided by x, using integer
 * division. The integer division truncates toward zero, which means losing
 * its fractional part.
 *
 * For example, the average of four elements 2, 3, 1,
 * and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75,
 * which truncates to 2.
 *
 * Example1:
 * <p>Input: nums = [7,4,3,9,1,8,5,2,6], k = 3
 * Output: [-1,-1,-1,5,4,4,-1,-1,-1]
 * Explanation:
 * - avg[0], avg[1], and avg[2] are -1 because there are less than k elements before each index.
 * - The sum of the subarray centered at index 3 with radius 3 is: 7 + 4 + 3 + 9 + 1 + 8 + 5 = 37.
 *   Using integer division, avg[3] = 37 / 7 = 5.
 * - For the subarray centered at index 4, avg[4] = (4 + 3 + 9 + 1 + 8 + 5 + 2) / 7 = 4.
 * - For the subarray centered at index 5, avg[5] = (3 + 9 + 1 + 8 + 5 + 2 + 6) / 7 = 4.
 * - avg[6], avg[7], and avg[8] are -1 because there are less than k elements after each index.</p>
 *
 * Example2:
 * <p>Input: nums = [100000], k = 0
 * Output: [100000]
 * Explanation:
 * - The sum of the subarray centered at index 0 with radius 0 is: 100000.
 *   avg[0] = 100000 / 1 = 100000.</p>
 *
 * Example3:
 * <p>Input: nums = [8], k = 100000
 * Output: [-1]
 * Explanation:
 * - avg[0] is -1 because there are less than k elements before and after index 0.</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         n == nums.length
 *     </li>
 *     <li>
 *         1 <= n <= 10^5
 *     </li>
 *     <li>
 *         0 <= nums[i], k <= 10^5
 *     </li>
 * </ul>
 *
 *
 * project leetcode-solutions
 * created 30.06.2022 16:06
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] getAverages(int[] nums, int k) {
        if (k <= 0) {
            return nums;
        }

        long currRadiusAvg = 0;
        int numsSize = nums.length, windowSize = k * 2 + 1;
        for (int windowIndex = 0; windowIndex < numsSize && windowIndex < windowSize; windowIndex++) {
            currRadiusAvg += nums[windowIndex];
        }


        int[] avgs = new int[numsSize];

        for (int numIndex = 0; numIndex < numsSize; numIndex++) {
            if (numIndex < k || numIndex >= numsSize - k) {
                avgs[numIndex] = -1;

                continue;
            }

            if (numIndex == k) {
                avgs[numIndex] = (int) (currRadiusAvg / windowSize);

                continue;
            }

            currRadiusAvg = currRadiusAvg - nums[numIndex - k - 1] + nums[numIndex + k];
            avgs[numIndex] = (int) (currRadiusAvg / windowSize);
        }

        return avgs;
    }
}
