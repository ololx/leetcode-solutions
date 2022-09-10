package io.github.ololx.leetcode.solutions.easy.task2042;

/**
 * 2042. Check if Numbers Are Ascending in a Sentence
 *
 * A sentence is a list of tokens separated by a single space with no leading
 * or trailing spaces. Every token is either a positive number consisting of
 * digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.
 * <ul>
 *     <li>
 *         For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens:
 *         "2" and "4" are numbers and the other tokens such as "puppy" are words.
 *     </li>
 * </ul>
 *
 * Given a string s representing a sentence, you need to check if all the numbers in s
 * are strictly increasing from left to right (i.e., other than the last number,
 * each number is strictly smaller than the number on its right in s).
 *
 * Return true if so, or false otherwise.
 *
 * Example 1:
 * <p>Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
 * Output: true
 * Explanation: The numbers in s are: 1, 3, 4, 6, 12.
 * They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.</p>
 *
 * Example 2:
 * <p>Input: s = "hello world 5 x 5"
 * Output: false
 * Explanation: The numbers in s are: 5, 5. They are not strictly increasing.</p>
 *
 * Example 3:
 * <p>Input: s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
 * Output: false
 * Explanation: The numbers in s are: 7, 51, 50, 60. They are not strictly increasing.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          3 <= s.length <= 200
 *      </li>
 *      <li>
 *          s consists of lowercase English letters, spaces, and digits from 0 to 9, inclusive.
 *      </li>
 *      <li>
 *          The number of tokens in s is between 2 and 100, inclusive.
 *      </li>
 *      <li>
 *          The tokens in s are separated by a single space.
 *      </li>
 *      <li>
 *          There are at least two numbers in s.
 *      </li>
 *      <li>
 *          Each number in s is a positive number less than 100, with no leading zeros.
 *      </li>
 *      <li>
 *          s contains no leading or trailing spaces.
 *      </li>
 * </ul>
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
