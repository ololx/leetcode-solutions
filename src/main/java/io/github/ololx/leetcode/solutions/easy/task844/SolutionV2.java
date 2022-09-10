package io.github.ololx.leetcode.solutions.easy.task844;

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
 *  * Output: true
 *  * Explanation: Both s and t become "".</p>
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
 * created 03.05.2022 12:47
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public boolean backspaceCompare(String s, String t) {
        return getBackspacedString(s).compareTo(getBackspacedString(t)) == 0;
    }

    public StringBuilder getBackspacedString(String str) {
        if (str == null) {
            return new StringBuilder();
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character character : str.toCharArray()) {
            if (character != 35 ) {
                stringBuilder.append(character);
            } else if (stringBuilder.length() > 0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }

        return stringBuilder;
    }
}
