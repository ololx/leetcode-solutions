package io.github.ololx.leetcode.examples.medium.task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        String[] sArray = s.split("");
        Set<String> tmpSubstring = new HashSet<>();
        int startPos = 0, maxLength = 0;
        for (int currentPos = startPos; currentPos < sArray.length; currentPos++) {
            if (tmpSubstring.contains(sArray[currentPos])) {
                tmpSubstring = new HashSet<>();
                startPos++;
                currentPos = startPos;
            }

            tmpSubstring.add(sArray[currentPos]);

            if (1 + currentPos - startPos > maxLength) {
                maxLength = 1 + currentPos - startPos;
            }
        }

        return maxLength;
    }
}
