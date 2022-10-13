package io.github.ololx.leetcode.solutions.hard.task68;

import java.util.ArrayList;
import java.util.List;

/**
 * project leetcode-solutions
 * created 12.10.2022 19:34
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justificatedStrings = new ArrayList<>();
        int currentWidth = 0, currentWordsCount = 0;

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            currentWidth += words[wordIndex].length();
            currentWordsCount++;

            if (wordIndex == words.length - 1 || currentWidth + words[wordIndex + 1].length() + currentWordsCount - 1 >= maxWidth) {
                StringBuilder justificatedString = new StringBuilder();
                int totalSpaceWidth = maxWidth - currentWidth;

                while (--currentWordsCount >= 0) {
                    justificatedString.append(words[wordIndex - currentWordsCount]);

                    int spaceWidth = (int) Math.ceil((double)totalSpaceWidth / currentWordsCount);

                    if (wordIndex == words.length - 1) {
                        spaceWidth = 1;
                    }

                    for (int j = 0; j < Math.min(spaceWidth, totalSpaceWidth); j++) {
                        justificatedString.append(" ");
                    }

                    totalSpaceWidth -= spaceWidth;
                }

                for (int j = 0; j < totalSpaceWidth; j++) {
                    justificatedString.append(" ");
                }

                justificatedStrings.add(justificatedString.toString());
                currentWordsCount = 0;
                currentWidth = 0;
            }
        }

        return justificatedStrings;
    }
}
