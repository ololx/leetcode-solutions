package io.github.ololx.leetcode.solutions.easy.task219;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 *
 * Given an integer array nums and an integer k, return true if there are
 * two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example1:
 * <p>Input: nums = [1,2,3,1], k = 3
 * Output: true</p>
 *
 * Example2:
 * <p>Input: nums = [1,0,1,1], k = 1
 * Output: true</p>
 *
 * Example3:
 * <p>Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= nums.length <= 10^5
 *     </li>
 *     <li>
 *         -10^9 <= nums[i] <= 10^9
 *     </li>
 *     <li>
 *         0 <= k <= 10^5
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 28.06.2022 21:52
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> slidingWindowHash = new HashSet();

        //init sliding window and put values into hash
        for (int slidingIndex = 0; slidingIndex < k && slidingIndex < nums.length; slidingIndex++) {
            if (slidingWindowHash.contains(nums[slidingIndex])) {
                return true;
            }

            slidingWindowHash.add(nums[slidingIndex]);
        }

        //main loop for sliding window
        for (int index = k; index < nums.length; index++) {
            if (slidingWindowHash.contains(nums[index])) {
                return true;
            }

            slidingWindowHash.add(nums[index]);
            slidingWindowHash.remove(nums[index - k]);

        }

        return false;
    }
}
