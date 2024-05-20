package io.github.ololx.leetcode.solutions.easy.task3090;

import java.util.HashMap;
import java.util.Map;

/**
 * 3090. Maximum Length Substring With Two Occurrences
 *
 * Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each
 * character.
 *
 * Example 1:
 * <p>Input: s = "bcbbbcba"
 *
 * Output: 4
 *
 * Explanation:
 *
 * The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".</p>
 *
 * Example 2:
 * <p>Input: s = "aaaa"
 *
 * Output: 2
 *
 * Explanation:
 *
 * The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= s.length <= 100
 *      </li>
 *      <li>
 *          s consists only of lowercase English letters.
 *      </li>
 * </ul>
 *
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
