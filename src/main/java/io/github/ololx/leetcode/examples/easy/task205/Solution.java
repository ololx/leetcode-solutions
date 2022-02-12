package io.github.ololx.leetcode.examples.easy.task205;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters. No two characters may map to the same character, but a character
 * may map to itself.
 *
 * Example 1:
 * <p>Input: s = "egg", t = "add"
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: s = "foo", t = "bar"
 * Output: false</p>
 *
 * Example 3:
 * <p>Input: s = "paper", t = "title"
 * Output: true</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 5 * 10^4
 *      </li>
 *      <li>
 *          t.length == s.length
 *      </li>
 *      <li>
 *          s and t consist of any valid ascii character.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 12.02.2022 17:41
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> isomorphicSCharacters = new HashMap();
        Map<Character, Character> isomorphicTCharacters = new HashMap();
        for (int currentCharIndex = 0; currentCharIndex < s.length(); currentCharIndex++) {
            Character sCharacter = s.charAt(currentCharIndex);
            Character tCharacter = t.charAt(currentCharIndex);
            Character isomorphicSCharacter = isomorphicSCharacters.getOrDefault(
                    sCharacter,
                    isomorphicTCharacters.get(tCharacter)
            );

            if (isomorphicSCharacter == null) {
                isomorphicSCharacter = t.charAt(currentCharIndex);
                isomorphicSCharacters.put(sCharacter, isomorphicSCharacter);
                isomorphicTCharacters.put(isomorphicSCharacter, sCharacter);
            }

            if (!isomorphicSCharacter.equals(tCharacter)
                    || !isomorphicTCharacters.get(tCharacter).equals(sCharacter)) {
                return false;
            }
        }

        return true;
    }
}
