package io.github.ololx.leetcode.examples.easy.task392;

/**
 * 392. Is Subsequence
 *
 * Given two strings s and t, return true if s is a subsequence of t,
 * or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the
 * original string by deleting some (can be none) of the characters
 * without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Example1:
 * <p>Input: s = "abc", t = "ahbgdc"
 * Output: true</p>
 *
 * Example2:
 * <p>Input: s = "axc", t = "ahbgdc"
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         0 <= s.length <= 100
 *     </li>
 *     <li>
 *         0 <= t.length <= 10^4
 *     </li>
 *     <li>
 *         s and t consist only of lowercase English letters.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 23.06.2022 22:57
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = -1;

        while (++tPointer < t.length() && sPointer < s.length()) {
            if (t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer++;
            }
        }

        return sPointer == s.length();
    }
}
