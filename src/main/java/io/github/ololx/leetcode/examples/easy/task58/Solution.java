package io.github.ololx.leetcode.examples.easy.task58;

/**
 * 58. Length of Last Word
 *
 * Given a string s consisting of some words separated by some number
 * of spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example 1:
 * <p>Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.</p>
 *
 * Example 2:
 * <p>Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.</p>
 *
 * Example 3:
 * <p>Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^4
 *      </li>
 *      <li>
 *          s consists of only English letters and spaces ' '.
 *      </li>
 *      <li>
 *          There will be at least one word in s.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 19.05.2022 20:08
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int stringLastIndex = s.length() - 1;
        int lastWordLength = 0;

        while(stringLastIndex >= 0 && s.charAt(stringLastIndex) == ' ') {
            stringLastIndex--;
        }

        while(lastWordLength <= stringLastIndex) {
            if (s.charAt(stringLastIndex - lastWordLength) == ' ') {
                break;
            }

            lastWordLength++;
        }

        return lastWordLength;
    }
}
