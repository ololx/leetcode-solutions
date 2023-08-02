package io.github.ololx.leetcode.solutions.easy.task704;

/**
 * 704. Binary Search
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise,
 * return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * <p>Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4</p>
 *
 * Example 2:
 * <p>Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 10^4
 *      </li>
 *      <li>
 *          -10^4 < nums[i], target < 10^4
 *      </li>
 *      <li>
 *          All the integers in nums are unique.
 *      </li>
 *      <li>
 *          nums is sorted in ascending order.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 02.08.2023 16:31
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int median = left + (right - left) / 2;

            if (nums[median] == target) {
                return median;
            }

            if (nums[median] < target) {
                left = ++median;
            } else {
                right = --median;
            }
        }

        return -1;
    }
}
