package io.github.ololx.leetcode.examples.medium.task792;

import java.util.HashMap;
import java.util.Map;

/**
 * 792. Number of Matching Subsequences
 *
 * Given a string s and an array of strings words, return the number
 * of words[i] that is a subsequence of s.
 *
 * A subsequence of a string is a new string generated from the
 * original string with some characters (can be none) deleted without
 * changing the relative order of the remaining characters.
 *
 * <ul>
 *     <li>
 *         For example, "ace" is a subsequence of "abcde".
 *     </li>
 * </ul>
 *
 * Example1:
 * <p>Input: s = "abcde", words = ["a","bb","acd","ace"]
 * Output: 3
 * Explanation: There are three strings in words that are
 * a subsequence of s: "a", "acd", "ace".</p>
 *
 * Example2:
 * <p>Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
 * Output: 2</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= s.length <= 5 * 10^4
 *     </li>
 *     <li>
 *         1 <= words.length <= 5000
 *     </li>
 *     <li>
 *         1 <= words[i].length <= 50
 *     </li>
 *     <li>
 *         s and words[i] consist of only lowercase English letters.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 24.06.2022 15:27
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int numMatchingSubseq(String s, String[] words) {
        int subStringCount = 0;

        Map<String, Integer> wordHash = new HashMap<>();

        for (String word : words) {
            if (wordHash.containsKey(word)) {
                subStringCount += wordHash.get(word);
                continue;
            }

            int wordPointer = 0, sPointer = -1;

            while (++sPointer < s.length() && wordPointer < word.length()) {
                if (s.charAt(sPointer) == word.charAt(wordPointer)) {
                    wordPointer++;
                }
            }

            if (wordPointer == word.length()) {
                wordHash.put(word, 1);
                subStringCount++;
            } else {
                wordHash.put(word, 0);
            }
        }

        return subStringCount;
    }
}
