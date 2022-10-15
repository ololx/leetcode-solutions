package io.github.ololx.leetcode.solutions.easy.task1592;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 1592. Rearrange Spaces Between Words
 *
 * You are given a string text of words that are placed among some number of spaces.
 * Each word consists of one or more lowercase English letters and are separated
 * by at least one space. It's guaranteed that text contains at least one word.
 *
 * Rearrange the spaces so that there is an equal number of spaces between every pair
 * of adjacent words and that number is maximized. If you cannot redistribute all
 * the spaces equally, place the extra spaces at the end, meaning the returned string
 * should be the same length as text.
 *
 * Return the string after rearranging the spaces.
 *
 * Example 1:
 * <p>Input: text = "  this   is  a sentence "
 * Output: "this   is   a   sentence"
 * Explanation: There are a total of 9 spaces and 4 words. We can evenly divide
 * the 9 spaces between the words: 9 / (4-1) = 3 spaces.</p>
 *
 * Example 2:
 * <p>Input: text = " practice   makes   perfect"
 * Output: "practice   makes   perfect "
 * Explanation: There are a total of 7 spaces and 3 words. 7 / (3-1) = 3
 * spaces plus 1 extra space. We place this extra space at the end of the string.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= text.length <= 100
 *      </li>
 *      <li>
 *          text consists of lowercase English letters and ' '.
 *      </li>
 *      <li>
 *          text contains at least one word.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 15.10.2022 15:06
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s{1,}");
        int spacesCount = extracted(text);

        return getProcessedString(words, spacesCount).toString();
    }

    private StringBuilder getProcessedString(String[] words, int spacesCount) {
        int spaces = spacesCount / (Math.max(1, words.length - 1));
        StringBuilder processedString = new StringBuilder();

        for (String word : words) {
            processedString.append(word);
            processedString.append(" ".repeat(Math.max(0, Math.min(spacesCount, spaces))));
            spacesCount -= spaces;
        }

        processedString.append(" ".repeat(Math.max(0, spacesCount)));
        return processedString;
    }

    private int extracted(String text) {
        int spacesCount = 0;
        for (char character : text.toCharArray()) {
            if (character == ' ') {
                spacesCount++;
            }
        }

        return spacesCount;
    }
}
