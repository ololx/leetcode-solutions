package io.github.ololx.leetcode.solutions.medium.task2486;

/**
 * 2486. Append Characters to String to Make Subsequence
 *
 * You are given two strings s and t consisting of only lowercase English letters.
 *
 * Return the minimum number of characters that need to be appended to
 * the end of s so that t becomes a subsequence of s.
 *
 * A subsequence is a string that can be derived from another string
 * by deleting some or no characters without changing the order of
 * the remaining characters.
 *
 * Example 1:
 * <p>Input: s = "coaching", t = "coding"
 * Output: 4
 * Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
 * Now, t is a subsequence of s ("coachingding").
 * It can be shown that appending any 3 characters to
 * the end of s will never make t a subsequence.</p>
 *
 * Example 2:
 * <p>Input: s = "abcde", t = "a"
 * Output: 0
 * Explanation: t is already a subsequence of s ("abcde").</p>
 *
 * Example 3:
 * <p>Input: s = "z", t = "abcde"
 * Output: 5
 * Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
 * Now, t is a subsequence of s ("zabcde").
 * It can be shown that appending any 4 characters to
 * the end of s will never make t a subsequence.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length, t.length <= 10^5
 *      </li>
 *      <li>
 *          s and t consist only of lowercase English letters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 27/11/2022 20:17
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int appendCharacters(String s, String t) {
        int sPointer = -1, tPointer = 0;

        while (++sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                tPointer++;
            }
        }

        return t.length() - tPointer;
    }
}
