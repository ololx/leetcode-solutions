package io.github.ololx.leetcode.solutions.easy.task283;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 283. Move Zeroes
 *
 * Given an integer array nums, move all 0's to the end
 * of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * <p>Input: a = 1, b = 2
 * Output: 3</p>
 *
 * Example 2:
 * <p>Input: nums = [0]
 * Output: [0]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= nums.length <= 10^4
 *     </li>
 *     <li>
 *         -2^31 <= nums[i] <= 2^31 - 1
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 28.04.2022 21:16
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int zeroCount = 0;
        Queue<Integer> insertIndexes = new ArrayDeque<>();

        for (int numIndex = 0; numIndex < nums.length; numIndex++) {
            if (nums[numIndex] == 0) {
                insertIndexes.add(numIndex);
                zeroCount++;
            } else if (!insertIndexes.isEmpty()) {
                nums[insertIndexes.poll()] = nums[numIndex];
                insertIndexes.add(numIndex);
            }
        }

        while (zeroCount > 0) {
            nums[nums.length - zeroCount] = 0;
            zeroCount--;
        }
    }
}
