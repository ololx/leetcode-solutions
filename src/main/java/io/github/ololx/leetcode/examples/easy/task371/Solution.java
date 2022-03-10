package io.github.ololx.leetcode.examples.easy.task371;

/**
 * 371. Sum of Two Integers
 *
 * Given two integers a and b, return the sum of the
 * two integers without using the operators + and -.
 *
 * Example 1:
 * <p>Input: a = 1, b = 2
 * Output: 3</p>
 *
 * Example 2:
 * <p>Input: a = 2, b = 3
 * Output: 5</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         -1000 <= a, b <= 1000
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 10.03.2022 13:40
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;

        if (carry != 0) {
            return getSum(sum, carry);
        }

        return sum;
    }
}
