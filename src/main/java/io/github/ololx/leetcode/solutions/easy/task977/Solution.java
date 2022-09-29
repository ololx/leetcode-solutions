package io.github.ololx.leetcode.solutions.easy.task977;

/**
 * 977. Squares of a Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 * <p>Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].</p>
 *
 * Example 2:
 * <p>Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]</p>
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
 *          nums is sorted in non-decreasing order.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 07.06.2022 14:27
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    //FIXME::Rewrite
    public int[] sortedSquares(int[] nums) {
        int currPointer = 1, lastMinPointer = 0;
        nums[lastMinPointer] = nums[lastMinPointer] * nums[lastMinPointer];

        while (lastMinPointer <= currPointer && currPointer < nums.length) {
            nums[currPointer] = nums[currPointer] * nums[currPointer];

            if (nums[currPointer] <= nums[lastMinPointer]) {
                nums[currPointer] ^= nums[lastMinPointer];
                nums[lastMinPointer] ^= nums[currPointer];
                nums[currPointer] ^= nums[lastMinPointer];

                lastMinPointer = currPointer;
            }

            currPointer++;
        }

        return nums;
    }
}
