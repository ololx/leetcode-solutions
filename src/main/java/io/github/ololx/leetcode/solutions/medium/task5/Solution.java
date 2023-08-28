package io.github.ololx.leetcode.solutions.medium.task5;

/**
 * project leetcode-solutions
 * created 09.08.2023 16:36
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String longestPalindrome(String s) {
        int stringLength = s.length();
        int[][] subStrings = new int[stringLength][stringLength];

        for (int subStringIndex = 0; subStringIndex < stringLength; subStringIndex++) {
            subStrings[subStringIndex][subStringIndex] = 1;
        }

        int startPolindromIndex = 0;
        int maxPolindromeLength = 1;

        for (int subStringLength = 2; subStringLength < stringLength; subStringLength++) {
            for (int subStringLeft = subStringLength - 1; subStringLeft < stringLength - subStringLength; subStringLeft++) {
                int subStringRight = subStringLeft + subStringLength - 1;

                if (subStrings[subStringLeft + 1][subStringRight - 1] == 1 && s.charAt(subStringLeft) == s.charAt(subStringRight)) {
                    subStrings[subStringLeft][subStringRight] = 1;
                    if (subStringLength > maxPolindromeLength) {
                        maxPolindromeLength = subStringLength;
                        startPolindromIndex = subStringLeft;
                    }
                }
            }
        }

        return s.substring(startPolindromIndex, maxPolindromeLength);
    }
}
