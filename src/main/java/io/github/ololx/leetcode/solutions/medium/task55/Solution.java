package io.github.ololx.leetcode.solutions.medium.task55;

/**
 * 55. Jump Game
 *
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the
 * array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 *
 * Example 1:
 * <p>Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.</p>
 *
 * Example 2:
 * <p>Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it
 * impossible to reach the last index.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 10^4
 *      </li>
 *      <li>
 *          0 <= nums[i] <= 10^5
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 06/05/2024 9:50am
 */
public class Solution {

    public boolean canJump(int[] nums) {
        var jumps = 0;

        for (var currentPont = 0; currentPont < nums.length; currentPont++) {
            if (jumps < currentPont) {
                return false;
            } else if (currentPont + nums[currentPont] >= nums.length - 1) {
                return true;
            }

            jumps = Math.max(jumps, currentPont + nums[currentPont]);
        }

        return true;
    }
}
