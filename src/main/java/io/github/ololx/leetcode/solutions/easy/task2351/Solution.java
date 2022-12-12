package io.github.ololx.leetcode.solutions.easy.task2351;

/**
 * 2351. First Letter to Appear Twice
 *
 * project leetcode-solutions
 * created 12.12.2022 21:18
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public char repeatedCharacter(String s) {
        char[] frequencies = new char[26];

        for (char character : s.toCharArray()) {
            if (frequencies[character - 97] > 0) {
                return character;
            }

            frequencies[character - 97]++;
        }

        return s.charAt(0);
    }
}
