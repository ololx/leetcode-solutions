package io.github.ololx.leetcode.examples.easy.task205;

import java.util.HashMap;
import java.util.Map;

/**
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

        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }

        Map<Character, Character> isomorphicCharacters = new HashMap();
        Map<Character, Character> mappedCharacters = new HashMap();
        for (int currentCharIndex = 0; currentCharIndex < s.length(); currentCharIndex++) {
            Character sCharacter = s.charAt(currentCharIndex);
            Character tCharacter = t.charAt(currentCharIndex);
            Character isomorphicSCharacter = isomorphicCharacters.getOrDefault(
                    sCharacter,
                    mappedCharacters.get(tCharacter)
            );

            if (isomorphicSCharacter == null) {
                isomorphicSCharacter = t.charAt(currentCharIndex);
                isomorphicCharacters.put(sCharacter, isomorphicSCharacter);
                mappedCharacters.put(isomorphicSCharacter, sCharacter);
            }

            if (!isomorphicSCharacter.equals(tCharacter)
                    || !mappedCharacters.get(tCharacter).equals(sCharacter)) {
                return false;
            }
        }

        return true;
    }
}
