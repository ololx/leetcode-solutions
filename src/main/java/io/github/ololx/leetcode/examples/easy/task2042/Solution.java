package io.github.ololx.leetcode.examples.easy.task2042;

import java.util.*;

/**
 * 2042. Check if Numbers Are Ascending in a Sentence
 *
 * project leetcode-solutions
 * created 13.02.2022 16:39
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean areNumbersAscending(String s) {
        if (s == null || s.length() < 3 || s.length() > 200) {
            return false;
        }

        String[] tokens = s.split(" ");
        if (tokens.length < 2 || tokens.length > 100) {
            return false;
        }

        int digitCounter = 0;
        int maxDigit = 0;
        for (int currentTokenIndex = 0; currentTokenIndex < tokens.length; currentTokenIndex++) {
            String currentToken = tokens[currentTokenIndex];
            Character tokenChar = currentToken.charAt(0);
            if (tokenChar <= 47 || tokenChar >= 58) {
                continue;
            }

            digitCounter++;

            int currentDigit = Integer.parseInt(currentToken);
            if (maxDigit >= currentDigit) {
                return false;
            }

            maxDigit = currentDigit;
        }

        return digitCounter >= 2;
    }
}
