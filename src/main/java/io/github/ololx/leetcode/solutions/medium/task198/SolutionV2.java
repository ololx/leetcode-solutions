/**
 * Copyright 2024 the project leetcode-solutions authors
 * and the original author or authors annotated by {@author}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
class SolutionV2 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        var previousMax = nums[0];
        var max = Math.max(previousMax, nums[1]);

        for (var houseNum = 2; houseNum < nums.length; houseNum++) {
            var curr = Math.max(max, previousMax + nums[houseNum]);
            previousMax = max;
            max = curr;
        }

        return max;
    }
}
