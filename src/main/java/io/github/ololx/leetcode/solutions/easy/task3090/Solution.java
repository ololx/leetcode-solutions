package io.github.ololx.leetcode.solutions.easy.task3090;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 20/05/2024 10:41am
 */
public class Solution {

    public int maximumLengthSubstring(String s) {
        int maxLengthOfSubstring = 0;

        Map<Character, Integer> occurrences = new HashMap<>();
        for (int rightPoint = 0, leftPoint = 0; rightPoint < s.length(); rightPoint++) {
            char rightCharacter = s.charAt(rightPoint);
            int rightOccurrences = occurrences.getOrDefault(rightCharacter, 0);

            if (rightOccurrences < 2) {
                occurrences.put(rightCharacter, ++rightOccurrences);
                maxLengthOfSubstring = Math.max(maxLengthOfSubstring, rightPoint - leftPoint + 1);
                continue;
            }

            rightPoint--;

            while (occurrences.get(rightCharacter) == 2) {
                char leftCharacter = s.charAt(leftPoint);
                int leftOccurrences = occurrences.get(leftCharacter);
                occurrences.put(leftCharacter, --leftOccurrences);
                leftPoint++;
            }
        }

        return maxLengthOfSubstring;
    }
}
