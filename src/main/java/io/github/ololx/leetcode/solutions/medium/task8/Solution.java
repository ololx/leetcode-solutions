package io.github.ololx.leetcode.solutions.medium.task8;

/**
 * 8. String to Integer (atoi)
 *
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit
 * signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 * <ol>
 *     <li>
 *         Read in and ignore any leading whitespace.
 *     </li>
 *     <li>
 *         Check if the next character (if not already at the end of the string)
 *         is '-' or '+'. Read this character in if it is either. This determines
 *         if the final result is negative or positive respectively. Assume the result
 *         is positive if neither is present.
 *     </li>
 *     <li>
 *         Read in next the characters until the next non-digit character or the end of
 *         the input is reached. The rest of the string is ignored.
 *     </li>
 *     <li>
 *         Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
 *         If no digits were read, then the integer is 0.
 *         Change the sign as necessary (from step 2).
 *     </li>
 *     <li>
 *         If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1],
 *         then clamp the integer so that it remains in the range. Specifically, integers less
 *         than -2^31 should be clamped to -2^31, and integers greater than 2^31 - 1 should be
 *         clamped to 2^31 - 1.
 *     </li>
 *     <li>
 *         Return the integer as the final result.
 *     </li>
 * </ol>
 *
 * Note:
 * <ul>
 *     <li>
 *         Only the space character ' ' is considered a whitespace character.
 *     </li>
 *     <li>
 *         Do not ignore any characters
 *         other than the leading whitespace or the rest of the string after the digits.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in,
 * caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "42" ("42" is read in)
 *            ^
 * The parsed integer is 42.
 * Since 42 is in the range [-2^31, 2^31 - 1], the final result is 42.</p>
 *
 * Example 2:
 * <p>Input: s = "   -42"
 * Output: -42
 * Explanation:
 * Step 1: "   -42" (leading whitespace is read and ignored)
 *             ^
 * Step 2: "   -42" ('-' is read, so the result should be negative)
 *              ^
 * Step 3: "   -42" ("42" is read in)
 *                ^
 * The parsed integer is -42.
 * Since -42 is in the range [-2^31, 2^31 - 1], the final result is -42.</p>
 *
 * Example 3:
 * <p>Input: s = "4193 with words"
 * Output: 4193
 * Explanation:
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "4193 with words" ("4193" is read in; reading stops because
 * the next character is a non-digit)
 *              ^
 * The parsed integer is 4193.
 * Since 4193 is in the range [-2^31, 2^31 - 1], the final result is 4193.</p>
 *
 * project leetcode-solutions
 * created 12.02.2022 20:50
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= s.length <= 200
 *      </li>
 *      <li>
 *          s consists of English letters (lower-case and upper-case),
 *          digits (0-9), ' ', '+', '-', and '.'.
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int myAtoi(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }

        int pointer = 0;
        while (pointer < s.length() && s.charAt(pointer) == 32) {
            pointer++;
        }

        int sign = 1;
        if (pointer < s.length() && (s.charAt(pointer) == 43 || s.charAt(pointer) == 45)) {
            sign = s.charAt(pointer) == 45 ? -1 : 1;
            pointer++;
        }

        int integer = 0;
        while (pointer < s.length()) {
            char symbol = s.charAt(pointer);
            if (symbol <= 47 || symbol >= 58) {
                break;
            }

            long nextInteger = (integer * 10L) + (symbol - '0');
            if (nextInteger > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            integer = (int) nextInteger;
            pointer++;
        }

        return integer * sign;
    }
}
