package io.github.ololx.leetcode.examples.easy.task2000;

/**
 * 2000. Reverse Prefix of Word
 *
 * Given a 0-indexed string word and a character ch, reverse the segment of word
 * that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
 * If the character ch does not exist in word, do nothing.
 *
 * <ol>
 *     <li>
 *         For example, if word = "abcdefd" and ch = "d",
 *         then you should reverse the segment that starts at 0 and
 *         ends at 3 (inclusive). The resulting string will be "dcbaefd".
 *     </li>
 * </ol>
 * Return the resulting string.
 *
 * Example 1:
 * <p>Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * Explanation: The first occurrence of "d" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".</p>
 *
 * Example 2:
 * <p>Input: word = "xyxzxe", ch = "z"
 * Output: "zxyxxe"
 * Explanation: The first and only occurrence of "z" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".</p>
 *
 * Example 3:
 * <p>Input: word = "abcd", ch = "z"
 * Output: "abcd"
 * Explanation: "z" does not exist in word.
 * You should not do any reverse operation, the resulting string is "abcd".</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= word.length <= 250
 *      </li>
 *      <li>
 *          word consists of lowercase English letters.
 *      </li>
 *      <li>
 *          ch is a lowercase English letter.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 29.07.2022 17:45
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public String reversePrefix(String word, char ch) {
        int rightPointer = 0;

        while (rightPointer < word.length() && word.charAt(rightPointer) != ch) {
            rightPointer++;
        }

        if (rightPointer == word.length() || rightPointer == 0) {
            return word;
        }

        StringBuilder reversedWord = new StringBuilder();
        int leftPointer = rightPointer + 1;

        while (leftPointer < word.length() || rightPointer >= 0) {
            if (rightPointer >= 0) {
                reversedWord.append(word.charAt(rightPointer));
                rightPointer--;
            } else if (leftPointer < word.length()) {
                reversedWord.append(word.charAt(leftPointer));
                leftPointer++;
            }
        }

        return reversedWord.toString();
    }
}
