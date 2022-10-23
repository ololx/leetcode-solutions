package io.github.ololx.leetcode.solutions.easy.task2423;

/**
 * 2423. Remove Letter To Equalize Frequency
 *
 * You are given a 0-indexed string word, consisting of lowercase English letters.
 * You need to select one index and remove the letter at that index from word so that
 * the frequency of every letter present in word is equal.
 *
 * Return true if it is possible to remove one letter so that the frequency of
 * all letters in word are equal, and false otherwise.
 *
 * Note:
 * <ul>
 *     <ol>
 *         The frequency of a letter x is the number of times it occurs in the string.
 *     </ol>
 *     <ol>
 *         You must remove exactly one letter and cannot chose to do nothing.
 *     </ol>
 * </ul>
 *
 * Example 1:
 * <p>Input: word = "abcc"
 * Output: true
 * Explanation: Select index 3 and delete it: word becomes "abc"
 * and each character has a frequency of 1.</p>
 *
 * Example 2:
 * <p>Input: word = "aazz"
 * Output: false
 * Explanation: We must delete a character, so either the frequency of "a" is 1 and
 * the frequency of "z" is 2, or vice versa. It is impossible to make all
 * present letters have equal frequency.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= word.length <= 100
 *      </li>
 *      <li>
 *          word consists of lowercase English letters only.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 22.10.2022 22:57
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean equalFrequency(String word) {
        int[] frequencies = new int[26];

        for (char character : word.toCharArray()) {
            frequencies[character - 97]++;
        }

        for (int character : word.toCharArray()) {
            frequencies[character - 97]--;

            boolean equals = true;
            int lastFrequency = -1;

            for (int frequency : frequencies) {
                if (frequency == 0) {
                    continue;
                }

                if (lastFrequency == -1) {
                    lastFrequency = frequency;
                    continue;
                }

                if (frequency != lastFrequency) {
                    equals = false;
                    break;
                }
            }

            if (equals) {
                return true;
            }

            frequencies[character - 97]++;
        }

        return false;
    }
}
