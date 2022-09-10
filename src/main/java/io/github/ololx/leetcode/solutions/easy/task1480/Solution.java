package io.github.ololx.leetcode.solutions.easy.task1480;

/**
 * 1480. Running Sum of 1d Array
 *
 * Given an array nums. We define a running sum of an array
 * as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 * Example 1:
 * <p>Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows:
 * [1, 1+2, 1+2+3, 1+2+3+4].</p>
 *
 * Example 2:
 * <p>Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows:
 * [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].</p>
 *
 * Example 3:
 * <p>Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 1000
 *      </li>
 *      <li>
 *          -10^6 <= nums[i] <= 10^6
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 01.06.2022 21:14
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] runningSum(int[] nums) {

        for (int numIndex = 1; numIndex < nums.length; numIndex++) {
            nums[numIndex] += nums[numIndex - 1];
        }

        return nums;
    }
}
