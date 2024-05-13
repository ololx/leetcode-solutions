package io.github.ololx.leetcode.solutions.medium.task45;

/**
 * 45. Jump Game II
 *
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 *
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at
 * nums[i], you can jump to any nums[i + j] where:
 * <ul>
 *     <lo>0 <= j <= nums[i] and</lo>
 *     <lo>i + j < n</lo>
 * </ul>
 *
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 *
 * Example 1:
 * <p>Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.</p>
 *
 * Example 2:
 * <p>Input: nums = [2,3,0,1,4]
 * Output: 2</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 10^4
 *      </li>
 *      <li>
 *          0 <= nums[i] <= 1000
 *      </li>
 *      <li>
 *          It's guaranteed that you can reach nums[n - 1].
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 07/05/2024 13:10am
 */
public class Solution {

    public int jump(int[] nums) {
        var jumps = 0;
        var currentEndPoint = 0;
        var maxJumpedPoint = 0;

        for (var currentPoint = 0; currentPoint < nums.length; currentPoint++) {
            maxJumpedPoint = Math.max(maxJumpedPoint, currentPoint + nums[currentPoint]);

            if (currentEndPoint >= nums.length - 1) {
                return jumps;
            }

            if (currentEndPoint == currentPoint) {
                currentEndPoint = maxJumpedPoint;
                jumps++;
            }
        }

        return jumps;
    }
}
