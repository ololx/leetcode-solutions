package io.github.ololx.leetcode.examples.easy.task303;

/**
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
