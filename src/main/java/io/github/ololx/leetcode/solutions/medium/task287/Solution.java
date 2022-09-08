package io.github.ololx.leetcode.solutions.medium.task287;

import java.util.HashSet;
import java.util.Set;

/**
 * 287. Find the Duplicate Number
 *
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 *
 * Example 1:
 * <p>Input: nums = [1,3,4,2,2]
 * Output: 2</p>
 *
 * Example 2:
 * <p>Input: nums = [3,1,3,4,2]
 * Output: 3</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 105
 *      </li>
 *      <li>
 *          nums.length == n + 1
 *      </li>
 *      <li>
 *          1 <= nums[i] <= n
 *      </li>
 *      <li>
 *          All the integers in nums appear only once except for precisely
 *          one integer which appears two or more times.
 *      </li>
 * </ul>
 *
 * Follow up:
 * <ul>
 *      <li>
 *          How can we prove that at least one duplicate number must exist in nums?
 *      </li>
 *      <li>
 *          Can you solve the problem in linear runtime complexity?
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 01.01.2022 13:11
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int findDuplicate(int[] nums) {
        if (nums == null) {
            return 0;
        }

        Set<Integer> uniqueNums = new HashSet<Integer>();
        for (int num : nums) {
            if (uniqueNums.contains(num)) {
                return num;
            }

            uniqueNums.add(num);
        }

        return 0;
    }
}

