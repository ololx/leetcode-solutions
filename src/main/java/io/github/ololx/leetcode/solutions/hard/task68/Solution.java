package io.github.ololx.leetcode.solutions.hard.task68;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. Text Justification
 *
 * Given an array of strings words and a width maxWidth, format the text
 * such that each line has exactly maxWidth characters and is fully (left and right) justified.
 *
 * You should pack your words in a greedy approach; that is, pack as many
 * words as you can in each line. Pad extra spaces ' ' when necessary so that
 * each line has exactly maxWidth characters.
 *
 * Extra spaces between words should be distributed as evenly as possible.
 * If the number of spaces on a line does not divide evenly between words,
 * the empty slots on the left will be assigned more spaces than the slots on the right.
 *
 * For the last line of text, it should be left-justified,
 * and no extra space is inserted between words.
 *
 * Note:
 * <ul>
 *     <lo>
 *         A word is defined as a character sequence consisting of non-space characters only.
 *     </lo>
 *     <lo>
 *         Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
 *     </lo>
 *     <lo>
 *         The input array words contains at least one word.
 *     </lo>
 * </ul>
 *
 * Example 1:
 * <p>Input: words = ["This", "is", "an", "example", "of", "text", "justification."],
 * maxWidth = 16
 * Output:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]</p>
 *
 * Example 2:
 * <p>Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * Output:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * Explanation: Note that the last line is "shall be    " instead of "shall     be",
 * because the last line must be left-justified instead of fully-justified.
 * Note that the second line is also left-justified because
 * it contains only one word.</p>
 *
 * Example 3:
 * <p>Input: words = ["Science","is","what","we","understand","well","enough",
 * "to","explain","to","a","computer.","Art","is","everything","else","we","do"],
 * maxWidth = 20
 * Output:
 * [
 *   "Science  is  what we",
 *   "understand      well",
 *   "enough to explain to",
 *   "a  computer.  Art is",
 *   "everything  else  we",
 *   "do                  "
 * ]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= words.length <= 300
 *      </li>
 *      <li>
 *          1 <= words[i].length <= 20
 *      </li>
 *      <li>
 *          words[i] consists of only English letters and symbols.
 *      </li>
 *      <li>
 *          1 <= maxWidth <= 100
 *      </li>
 *      <li>
 *          words[i].length <= maxWidth
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 12.10.2022 19:34
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> processedStrings = new ArrayList<>();
        int width = 0, wordsCount = 0;

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            width += words[wordIndex].length();
            wordsCount++;

            if (wordIndex == words.length - 1
                    || width + words[wordIndex + 1].length() + wordsCount - 1 >= maxWidth) {
                int totalSpaceWidth = maxWidth - width;
                StringBuilder processedString = new StringBuilder();

                while (--wordsCount >= 0) {
                    processedString.append(words[wordIndex - wordsCount]);
                    int spaceWidth = wordIndex == words.length - 1
                            ? 1
                            : (int) Math.ceil((double)totalSpaceWidth / wordsCount);
                    processedString.append(" ".repeat(Math.min(spaceWidth, totalSpaceWidth)));
                    totalSpaceWidth -= spaceWidth;
                }

                processedString.append(" ".repeat(totalSpaceWidth));
                processedStrings.add(processedString.toString());
                wordsCount = 0;
                width = 0;
            }
        }

        return processedStrings;
    }
}
