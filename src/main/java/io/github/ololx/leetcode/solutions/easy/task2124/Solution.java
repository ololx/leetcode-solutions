package io.github.ololx.leetcode.solutions.easy.task2124;

/**
 * 2124. Check if All A's Appears Before All B's
 *
 * Given a string s consisting of only the characters 'a' and 'b',
 * return true if every 'a' appears before every 'b' in the string.
 * Otherwise, return false.
 *
 * Example 1:
 * <p>Input: s = "aaabbb"
 * Output: true
 * Explanation:
 * The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
 * Hence, every 'a' appears before every 'b' and we return true.</p>
 *
 * Example 2:
 * <p>Input: s = "abab"
 * Output: false
 * Explanation:
 * There is an 'a' at index 2 and a 'b' at index 1.
 * Hence, not every 'a' appears before every 'b' and we return false.</p>
 *
 * Example 3:
 * <p>Input: s = "bbb"
 * Output: true
 * Explanation:
 * There are no 'a's, hence, every 'a' appears before every 'b' and we return true.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 100
 *      </li>
 *      <li>
 *          s[i] is either 'a' or 'b'.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 13.02.2022 17:15
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean checkString(String s) {
        if (s == null || s.length() < 1 || s.length() > 100) {
            return false;
        }

        Character prevChar = s.charAt(0);
        int pointer = 1;
        while(pointer < s.length()) {
            Character currChar = s.charAt(pointer);
            if (!currChar.equals('a') && !currChar.equals('b')) {
                return false;
            }

            if (currChar.equals('a') && prevChar.equals('b')) {
                return false;
            }

            prevChar = currChar;
            pointer++;
        }

        return true;
    }
}
