package io.github.ololx.leetcode.examples.medium.task7;

/**
 * 7. Reverse Integer
 *
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer
 * range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * <p>IInput: x = 123
 * Output: 321</p>
 *
 * Example 2:
 * <p>Input: x = -123
 * Output: -321</p>
 *
 * Example 3:
 * <p>Input: x = 120
 * Output: 21</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         -2^31 <= x <= 2^31 - 1
 *     </li>
 * </ul>
 *
 * Follow up: Could you solve it without converting the integer to a string?
 *
 * project leetcode-solutions
 * created 08.02.2022 21:00
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        int sign = x < 0 ? -1 : 1;
        long positiveX = (long) x * sign;

        int length = (int) (Math.log10(positiveX) + 1);
        if (length == 1) {
            return x;
        }

        long digit = 10;
        long reverseX = positiveX % digit;
        for (int digitIndex = 1; digitIndex < length; digitIndex++) {
            digit *= 10;
            reverseX = (reverseX * 10) + (positiveX % digit) / (digit / 10);
        }

        if (reverseX > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) (sign * reverseX);
    }
}
