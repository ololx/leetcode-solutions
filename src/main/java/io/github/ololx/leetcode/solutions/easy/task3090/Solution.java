package io.github.ololx.leetcode.solutions.easy.task3090;

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
        char[] occurrences = new char[26];

        for (int rightPoint = 0, leftPoint = 0; rightPoint < s.length(); rightPoint++) {
            char rightCharacter = s.charAt(rightPoint);
            occurrences[rightCharacter - 'a']++;

            if (occurrences[rightCharacter - 'a'] <= 2) {
                maxLengthOfSubstring = Math.max(maxLengthOfSubstring, rightPoint - leftPoint + 1);
                continue;
            }

            while (occurrences[rightCharacter - 'a'] > 2) {
                occurrences[s.charAt(leftPoint) - 'a']--;
                leftPoint++;
            }
        }

        return maxLengthOfSubstring;
    }
}
