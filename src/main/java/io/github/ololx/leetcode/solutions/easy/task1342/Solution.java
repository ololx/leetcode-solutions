package io.github.ololx.leetcode.solutions.easy.task1342;

/**
 * 1342. Number of Steps to Reduce a Number to Zero
 *
 * Given an integer num, return the number of steps to reduce it to zero.
 *
 * In one step, if the current number is even, you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 *
 * Example 1:
 * <p>Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.</p>
 *
 * Example 2:
 * <p>Input: num = 8
 * Output: 4
 * Explanation:
 * Step 1) 8 is even; divide by 2 and obtain 4.
 * Step 2) 4 is even; divide by 2 and obtain 2.
 * Step 3) 2 is even; divide by 2 and obtain 1.
 * Step 4) 1 is odd; subtract 1 and obtain 0.</p>
 *
 * Example 3:
 * <p>Input: num = 123
 * Output: 12</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= num <= 10^6
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 27.05.2022 09:55
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int numberOfSteps(int num) {
        int reduceCount = 0;

        while (num > 0) {
            num = ((num & 1) == 0) ? num >> 1 : num -1;
            reduceCount++;
        }

        return reduceCount;
    }
}
