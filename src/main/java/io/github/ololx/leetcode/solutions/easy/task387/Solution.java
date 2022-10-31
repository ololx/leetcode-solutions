package io.github.ololx.leetcode.solutions.easy.task387;

/**
 * project leetcode-solutions
 * created 31.10.2022 11:02
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        char[] letters = s.toCharArray();

        for (char letter : letters) {
            frequency[letter - 97]++;
        }

        for (int index = 0; index < letters.length; index++) {
            if (frequency[s.charAt(index) - 97] == 1) {
                return index;
            }
        }

        return -1;
    }
}
