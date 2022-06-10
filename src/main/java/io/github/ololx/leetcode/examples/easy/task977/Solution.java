package io.github.ololx.leetcode.examples.easy.task977;

import java.util.Stack;

/**
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
