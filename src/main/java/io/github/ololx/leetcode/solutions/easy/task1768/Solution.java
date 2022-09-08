package io.github.ololx.leetcode.solutions.easy.task1768;

/**
 * 1768. Merge Strings Alternately
 *
 * You are given two strings word1 and word2. Merge the strings by adding letters
 * in alternating order, starting with word1. If a string is longer than the other,
 * append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * Example 1:
 * <p>Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r</p>
 *
 * Example 2:
 * <p>Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s</p>
 *
 * Example 3:
 * <p>Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *           1 <= word1.length, word2.length <= 100
 *      </li>
 *      <li>
 *           word1 and word2 consist of lowercase English letters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 29.07.2022 14:08
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String mergeAlternately(String word1, String word2) {
        int word1Pointer = -1, word2Pointer = -1;
        StringBuilder mergedWord = new StringBuilder();

        while (word1Pointer < word1.length() || word2Pointer < word2.length()) {
            if (++word1Pointer < word1.length()) {
                mergedWord.append(word1.charAt(word1Pointer));
            }

            if (++word2Pointer < word2.length()) {
                mergedWord.append(word2.charAt(word2Pointer));
            }
        }

        return mergedWord.toString();
    }
}
