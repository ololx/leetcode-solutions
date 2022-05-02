package io.github.ololx.leetcode.examples.easy.task27;

/**
 * project leetcode-solutions
 * created 21.04.2022 22:53
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int num : nums) {
            if (val != num) {
                nums[count] = num;
                count++;
            }
        }

        return count;
    }
}
