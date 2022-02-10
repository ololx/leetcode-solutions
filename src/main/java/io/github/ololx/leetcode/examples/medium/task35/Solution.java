package io.github.ololx.leetcode.examples.medium.task35;

/**
 * Given a sorted array of distinct integers and a target value, return the index
 * if the target is found. If not, return the index where it would be
 * if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * <p>Input: nums = [1,3,5,6], target = 5
 * Output: 2</p>
 *
 * Example 2:
 * <p>Input: nums = [1,3,5,6], target = 2
 * Output: 1</p>
 *
 * Example 3:
 * <p>Input: nums = [1,3,5,6], target = 7
 * Output: 4</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 10^4
 *      </li>
 *      <li>
 *          -10^4 <= nums[i] <= 10^4
 *      </li>
 *      <li>
 *          nums contains distinct values sorted in ascending order.
 *      </li>
 *      <li>
 *          -10^4 <= target <= 10^4
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 10.02.2022 12:48
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int pos = target - 1;
        if (nums.length < target) {
            pos = nums.length - 1;
        }



        System.out.println("POS = " + pos + "   target = " + target);

        return 0;
    }
}
