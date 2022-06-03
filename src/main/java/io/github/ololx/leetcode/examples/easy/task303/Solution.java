package io.github.ololx.leetcode.examples.easy.task303;

/**
 * 303. Range Sum Query - Immutable
 *
 * Given an integer array nums, handle multiple queries of the following type:
 *
 * <p>1. Calculate the sum of the elements of nums between indices left
 * and right inclusive where left <= right.</p>
 *
 * Implement the NumArray class:
 * <ul>
 *     <li>
 *          NumArray(int[] nums) Initializes the object with the integer array nums.
 *     </li>
 *     <li>
 *          int sumRange(int left, int right) Returns the sum of the elements of
 *          nums between indices left and right inclusive
 *          (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 *     </li>
 * </ul>
 *
 * Example 1
 * <p>Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 *
 * Explanation
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
 * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
 * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= nums.length <= 10^4
 *     </li>
 *     <li>
 *         -10^5 <= nums[i] <= 10^5
 *     </li>
 *     <li>
 *         0 <= left <= right < nums.length
 *     </li>
 *     <li>
 *         At most 104 calls will be made to sumRange.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 02.06.2022 10:52
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class NumArray {

        private final int[] values;

        public NumArray(int[] nums) {
            this.values = nums;
        }

        public int sumRange(int left, int right) {
            int sumRange = this.values[left];

            while (++left <= right) {
                sumRange += this.values[left];
            }

            return sumRange;
        }
    }
}
