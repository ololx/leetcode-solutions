package io.github.ololx.leetcode.solutions.easy.task258;

/**
 * 258. Add Digits
 *
 * Given an integer num, repeatedly add all its digits until
 * the result has only one digit, and return it.
 *
 * Example 1:
 * <p>Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * Since 2 has only one digit, return it.</p>
 *
 * Example 2:
 * <p>Input: num = 0
 * Output: 0</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= num <= 2^31 - 1
 *      </li>
 * </ul>
 *
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
 *
 * project leetcode-solutions
 * created 16.05.2022 11:21
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (--num % 9);
    }
}
