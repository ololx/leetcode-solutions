package io.github.ololx.leetcode.examples.easy.task242;

/**
 * 242. Valid Anagram
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly once.
 *
 * Example1:
 * <p>Input: s = "anagram", t = "nagaram"
 * Output: true</p>
 *
 * Example2:
 * <p>Input: s = "rat", t = "car"
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= s.length, t.length <= 5 * 10^4
 *     </li>
 *     <li>
 *         s and t consist of lowercase English letters.
 *     </li>
 * </ul>
 *
 * Follow up: What if the inputs contain Unicode characters?
 * How would you adapt your solution to such a case?
 *
 * project leetcode-solutions
 * created 21.06.2022 21:25
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] hash = new int[26];

        for (int letterIndex = 0; letterIndex < s.length(); letterIndex++) {
            hash[s.charAt(letterIndex) - 97] += 1;
            hash[t.charAt(letterIndex) - 97] -= 1;
        }

        for (int letterCount : hash) {
            if (letterCount != 0) {
                return false;
            }
        }

        return true;
    }
}
