package io.github.ololx.leetcode.solutions.medium.task198;

/**
 * 198. House Robber
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you
 * can rob tonight without alerting the police.
 *
 * Example 1:
 * <p>Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.</p>
 *
 * Example 2:
 * <p>Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 100
 *      </li>
 *      <li>
 *          0 <= nums[i] <= 400
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 04/05/2024 9:07am
 */
class Solution {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        var dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (var houseNum = 2; houseNum < nums.length; houseNum++) {
            dp[houseNum] = Math.max(dp[houseNum - 1], dp[houseNum - 2] + nums[houseNum]);
        }

        return dp[dp.length - 1];
    }
}
