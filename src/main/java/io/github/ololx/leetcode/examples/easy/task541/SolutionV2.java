package io.github.ololx.leetcode.examples.easy.task541;

/**
 * 541. Reverse String II
 *
 * Given a string s and an integer k, reverse the first k characters
 * for every 2k characters counting from the start of the string.
 *
 * If there are fewer than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and leave the other as original.
 *
 * Example 1:
 * <p>Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"</p>
 *
 * Example 2:
 * <p>Input: s = "abcd", k = 2
 * Output: "bacd"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^4
 *      </li>
 *      <li>
 *          s consists of only lowercase English letters.
 *      </li>
 *      <li>
 *          1 <= k <= 104
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 31.05.2022 12:16
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public String reverseStr(String s, int k) {
        char[] reversed = s.toCharArray();

        for (int currentIndex = 0; currentIndex < reversed.length; currentIndex += k << 1) {
            int leftIndex = currentIndex - 1;
            int rightIndex = Math.min(currentIndex + k, reversed.length);

            while (++leftIndex < --rightIndex) {
                reversed[leftIndex] ^= reversed[rightIndex];
                reversed[rightIndex] ^= reversed[leftIndex];
                reversed[leftIndex] ^= reversed[rightIndex];
            }
        }

        return String.valueOf(reversed);
    }
}
