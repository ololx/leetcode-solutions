package io.github.ololx.leetcode.solutions.medium.task3;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 *
 * Example 1:
 * <p>Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.</p>
 *
 * Example 2:
 * <p>Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.</p>
 *
 * Example 3:
 * <p>Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke"
 * is a subsequence and not a substring.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= s.length <= 5 * 10^4
 *      </li>
 *      <li>
 *          s consists of English letters, digits, symbols and spaces.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 07.02.2022 15:51
 *
 * @author Alexander A. Kropotin
 */
class SolutionV2 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexes = new HashMap<>();
        int maxLength = 0;

        for (int currentIndex = 0, firstIndex = 0; currentIndex < s.length(); currentIndex++) {
            firstIndex = Math.max(firstIndex, charIndexes.getOrDefault(s.charAt(currentIndex), 0));
            charIndexes.put(s.charAt(currentIndex), currentIndex + 1);
            maxLength = Math.max(maxLength, currentIndex - firstIndex + 1);
        }

        return maxLength;
    }
}
