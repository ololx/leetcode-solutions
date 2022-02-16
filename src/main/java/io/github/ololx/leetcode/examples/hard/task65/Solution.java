package io.github.ololx.leetcode.examples.hard.task65;

/**
 * 65. Valid Number
 *
 * A valid number can be split up into these components (in order):
 * <ol>
 *     <il>
 *         A decimal number or an integer.
 *     </il>
 *     <il>
 *         (Optional) An 'e' or 'E', followed by an integer.
 *     </il>
 * </ol>
 *
 * A decimal number can be split up into these components (in order):
 * <ol>
 *     <il>
 *         (Optional) A sign character (either '+' or '-').
 *     </il>
 *     <il>
 *         One of the following formats:
 *         <ol>
 *             <li>
 *                 One or more digits, followed by a dot '.'.
 *             </li>
 *             <li>
 *                 One or more digits, followed by a dot '.', followed by one or more digits.
 *             </li>
 *             <li>
 *                 A dot '.', followed by one or more digits.
 *             </li>
 *         </ol>
 *     </il>
 * </ol>
 *
 * An integer can be split up into these components (in order):
 * <ol>
 *     <li>
 *         (Optional) A sign character (either '+' or '-').
 *     </li>
 *     <li>
 *         One or more digits.
 *     </li>
 * </ol>
 *
 * For example, all the following are valid numbers:
 * ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93",
 * "-123.456e789"],
 * while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6",
 * "-+3", "95a54e53"].
 *
 * Given a string s, return true if s is a valid number.
 *
 * Example 1:
 * <p>Input: s = "0"
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: s = "e"
 * Output: false</p>
 *
 * Example 3:
 * <p>Input: s = "."
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 20
 *      </li>
 *      <li>
 *          s consists of only English letters (both uppercase and lowercase),
 *          digits (0-9), plus '+', minus '-', or dot '.'.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 16.02.2022 10:21
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isNumber(String s) {
        if (s == null || s.isBlank()) {
            return false;
        }

        boolean isExp = false, isReal = false, isValid = false;

        int pointer = s.charAt(0) == 43 || s.charAt(0) == 45 ? 1 : 0;
        while (pointer < s.length()) {
            char symbol = s.charAt(pointer);

            if (symbol == 43 || symbol == 45) {
                if (pointer <= 0 || s.charAt(pointer - 1) != 101) {
                    return false;
                }

                isValid = false;
            } else if ((symbol == 69 || symbol == 101)) {
                if (pointer <= 0 || !isValid || isExp || pointer + 1 >= s.length()) {
                    return false;
                }

                isExp = true;
                isValid = false;
            } else if (symbol == 44 || symbol == 46) {
                if (isExp || isReal) {
                    return false;
                }

                isReal = true;
            } else if (symbol <= 47 || symbol >= 58) {
                return false;
            } else {
                isValid = true;
            }

            pointer++;
        }

        return isValid;
    }
}
