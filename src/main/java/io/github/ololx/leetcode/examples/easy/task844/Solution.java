package io.github.ololx.leetcode.examples.easy.task844;

/**
 * 844. Backspace String Compare
 *
 * Given two strings s and t, return true if they are equal when both
 * are typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 * <p>Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".</p>
 *
 * Example 2:
 * <p>Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".</p>
 *
 * Example 3:
 * <p>Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length, t.length <= 200
 *      </li>
 *      <li>
 *          s and t only contain lowercase letters and '#' characters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 01.05.2022 20:36
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean backspaceCompare(String s, String t) {
        if (s == null && t != null) {
            return false;
        } else if (s != null && t == null) {
            return false;
        }

        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();

        int maxLength = Math.max(s.length(), t.length());

        for (int charIndex = 0; charIndex < maxLength; charIndex += 1) {
            if (s.length() > charIndex) {
                Character sChar = s.charAt(charIndex);

                if (sChar == '#') {
                    int sBuilderLength = sBuilder.length();
                    if (sBuilderLength != 0) {
                        sBuilder.deleteCharAt(sBuilderLength - 1);
                    }
                } else {
                    sBuilder.append(sChar);
                }
            }

            if (t.length() > charIndex) {
                Character tChar = t.charAt(charIndex);

                if (tChar == '#') {
                    int tBuilderLength = tBuilder.length();
                    if (tBuilderLength != 0) {
                        tBuilder.deleteCharAt(tBuilderLength - 1);
                    }
                } else {
                    tBuilder.append(tChar);
                }
            }
        }

        return sBuilder.compareTo(tBuilder) == 0;
    }
}
