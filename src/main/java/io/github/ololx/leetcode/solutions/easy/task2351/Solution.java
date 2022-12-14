package io.github.ololx.leetcode.solutions.easy.task2351;

/**
 * 2351. First Letter to Appear Twice
 *
 * Given a string s consisting of lowercase English letters,
 * return the first letter to appear twice.
 *
 * Note:
 * <ol>
 *     <li>
 *         A letter a appears twice before another letter b
 *         if the second occurrence of a is before the second occurrence of b.
 *     </li>
 *     <li>
 *         s will contain at least one letter that appears twice.
 *     </li>
 * </ol>
 *
 * Example 1:
 * <p>Input: s = "abccbaacz"
 * Output: "c"
 * Explanation:
 * The letter 'a' appears on the indexes 0, 5 and 6.
 * The letter 'b' appears on the indexes 1 and 4.
 * The letter 'c' appears on the indexes 2, 3 and 7.
 * The letter 'z' appears on the index 8.
 * The letter 'c' is the first letter to appear twice,
 * because out of all the letters the index of its second occurrence is the smallest.</p>
 *
 * Example 2:
 * <p>Input: s = "abcdd"
 * Output: "d"
 * Explanation:
 * The only letter that appears twice is 'd' so we return 'd'.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= s.length <= 100
 *      </li>
 *      <li>
 *          s consists of lowercase English letters.
 *      </li>
 *      <li>
 *          s has at least one repeated letter.
 *      </li>
 * </ul>
 *
 *
 * project leetcode-solutions
 * created 12.12.2022 21:18
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public char repeatedCharacter(String s) {
        char[] frequencies = new char[26];

        for (char character : s.toCharArray()) {
            if (++frequencies[character - 97] > 1) {
                return character;
            }
        }

        return s.charAt(0);
    }
}
