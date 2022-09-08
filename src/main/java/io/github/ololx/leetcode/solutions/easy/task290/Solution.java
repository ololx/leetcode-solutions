package io.github.ololx.leetcode.solutions.easy.task290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 290. Word Pattern
 *
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between
 * a letter in pattern and a non-empty word in s.
 *
 * Example 1:
 * <p>Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false</p>
 *
 * Example 3:
 * <p>Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= pattern.length <= 300
 *      </li>
 *      <li>
 *          pattern contains only lower-case English letters.
 *      </li>
 *      <li>
 *          1 <= s.length <= 3000
 *      </li>
 *      <li>
 *          s contains only lowercase English letters and spaces ' '.
 *      </li>
 *      <li>
 *          s does not contain any leading or trailing spaces.
 *      </li>
 *      <li>
 *          All the words in s are separated by a single space.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 22.05.2022 17:39
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> wordPatterns = new HashMap<>();
        Set<String> words = new HashSet<>();
        int currentWordIndex = 0, currentCharIndex = 0;

        while (currentWordIndex < pattern.length()) {
            StringBuilder word = new StringBuilder();

            while (currentCharIndex < s.length() && s.charAt(currentCharIndex) != ' ') {
                word.append(s.charAt(currentCharIndex));
                currentCharIndex++;
            }
            currentCharIndex++;

            if (!words.contains(word.toString())
                    && !wordPatterns.containsKey(pattern.charAt(currentWordIndex))) {
                words.add(word.toString());
                wordPatterns.put(pattern.charAt(currentWordIndex), word.toString());
            } else if (!wordPatterns.getOrDefault(pattern.charAt(currentWordIndex), "").equals(word.toString())) {
                return false;
            }

            currentWordIndex++;
        }


        return --currentCharIndex == s.length();
    }
}
