package io.github.ololx.leetcode.solutions.easy.task2455;

/**
 * 2455. Average Value of Even Numbers That Are Divisible by Three
 *
 * Given an integer array nums of positive integers, return the average value of
 * all even integers that are divisible by 3.
 *
 * Note that the average of n elements is the sum of the n elements divided by n
 * and rounded down to the nearest integer.
 *
 * Example 1:
 * <p>Input: nums = [1,3,6,10,12,15]
 * Output: 9
 * Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.</p>
 *
 * Example 2:
 * <p>Input: nums = [1,2,4,7,10]
 * Output: 0
 * Explanation: There is no single number that satisfies the requirement, so return 0.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 1000
 *      </li>
 *      <li>
 *          1 <= nums[i] <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 20/11/2022 21:09
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int averageValue(int[] nums) {
        int average = 0, count = 0;

        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                average += num;
                count++;
            }
        }

        return count != 0 ? average / count : average;
    }
}
