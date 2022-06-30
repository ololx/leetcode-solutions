package io.github.ololx.leetcode.examples.medium.task2090;

/**
 * project leetcode-solutions
 * created 30.06.2022 16:06
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] getAverages(int[] nums, int k) {
        int currRadiusAvg = 0;
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
                currRadiusAvg = currRadiusAvg + nums[numIndex + k + 1];
                avgs[numIndex] = currRadiusAvg / windowSize;

                continue;
            }

            if (numIndex == numsSize - k - 1) {
                currRadiusAvg = currRadiusAvg - nums[numIndex - k - 1];
                avgs[numIndex] = currRadiusAvg / windowSize;

                continue;
            }

            currRadiusAvg = currRadiusAvg - nums[numIndex - k - 1] + nums[numIndex + k];
            avgs[numIndex] = currRadiusAvg / windowSize;
        }

        return avgs;
    }
}
