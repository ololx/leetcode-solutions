package io.github.ololx.leetcode.solutions.easy.task69;

/**
 * 69. Sqrt(x)
 *
 * Given a non-negative integer x, compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 *
 * Note: You are not allowed to use any built-in exponent function or operator,
 * such as pow(x, 0.5) or x ** 0.5.
 *
 * Example 1:
 * <p>Input: x = 4
 * Output: 2</p>
 *
 * Example 2:
 * <p>Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842...,
 * and since the decimal part is truncated, 2 is returned.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= x <= 2^31 - 1
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 29.05.2022 15:52
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int mySqrt(int x) {
        long left = 1, right = x, sqrtX = x;

        while (left <= right) {
            long median = (left + right) >> 1;

            if (median * median == x) {
                return (int) median;
            }

            if (median * median > x) {
                right = --median;
            } else {
                sqrtX = median;
                left = ++median;
            }
        }

        return (int) sqrtX;
    }
}
