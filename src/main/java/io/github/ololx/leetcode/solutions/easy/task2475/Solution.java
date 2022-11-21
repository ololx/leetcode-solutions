package io.github.ololx.leetcode.solutions.easy.task2475;

/**
 * 2475. Number of Unequal Triplets in Array
 *
 * You are given a 0-indexed array of positive integers nums. Find the number
 * of triplets (i, j, k) that meet the following conditions:
 * <ol>
 *     <li>
 *      0 <= i < j < k < nums.length
 *     </li>
 *     <li>
 *         nums[i], nums[j], and nums[k] are pairwise distinct. In other words,
 *         nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
 *     </li>
 * </ol>
 *
 * Example 1:
 * <p>Input: nums = [4,4,2,4,3]
 * Output: 3
 * Explanation: The following triplets meet the conditions:
 * - (0, 2, 4) because 4 != 2 != 3
 * - (1, 2, 4) because 4 != 2 != 3
 * - (2, 3, 4) because 2 != 4 != 3
 * Since there are 3 triplets, we return 3.
 * Note that (2, 0, 4) is not a valid triplet because 2 > 0.</p>
 *
 * Example 2:
 * <p>Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: No triplets meet the conditions so we return 0.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          3 <= nums.length <= 100
 *      </li>
 *      <li>
 *          1 <= nums[i] <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 21/11/2022 21:35
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int unequalTriplets(int[] nums) {
        int unequalsCount = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        unequalsCount++;
                    }
                }
            }
        }

        return unequalsCount;
    }
}
