package io.github.ololx.leetcode.solutions.medium.task1679;

import java.util.HashMap;
import java.util.Map;

/**
 * 1679. Max Number of K-Sum Pairs
 *
 * You are given an integer array nums and an integer k.
 *
 * In one operation, you can pick two numbers from the array
 * whose sum equals k and remove them from the array.
 *
 * Return the maximum number of operations you can perform on the array.
 *
 * Example 1:
 * <p>Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.</p>
 *
 * Example 2:
 * <p>Input: nums = [3,1,3,4,3], k = 6
 * Output: 1
 * Explanation: Starting with nums = [3,1,3,4,3]:
 * - Remove the first two 3's, then nums = [1,4,3]
 * There are no more pairs that sum up to 6, hence a total of 1 operation.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 10^5
 *      </li>
 *      <li>
 *          1 <= nums[i] <= 10^9
 *      </li>
 *      <li>
 *         1 <= k <= 10^9
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 04.05.2022 20:11
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int maxOperations(int[] nums, int k) {
        final Map<Integer, Integer> numPairs = new HashMap<>();
        int deleteOperationsCount = 0;

        for (int num : nums) {
            Integer expectedNumCount = numPairs.get(k - num);

            if (expectedNumCount != null && expectedNumCount > 0) {
                deleteOperationsCount++;
                numPairs.put(k - num, expectedNumCount - 1);
            } else {
                Integer actualNumCount = numPairs.get(num);
                numPairs.put(num, actualNumCount == null ? 1 : ++actualNumCount);
            }
        }

        return deleteOperationsCount;
    }
}
