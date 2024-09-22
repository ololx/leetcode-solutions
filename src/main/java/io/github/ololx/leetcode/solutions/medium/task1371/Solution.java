package io.github.ololx.leetcode.solutions.medium.task1371;

import java.util.HashMap;
import java.util.Map;

/**
 * 1371. Find the Longest Substring Containing Vowels in Even Counts
 *
 * Given the string s, return the size of the longest substring containing each vowel an even number of times.
 * That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.
 *
 * Example 1:
 * <p>Input: s = "eleetminicoworoep"
 * Output: 13
 * Explanation: The longest substring is "leetminicowor" which contains two each of the vowels: e,
 * i and o and zero of the vowels: a and u.</p>
 *
 * Example 2:
 * <p>Input: s = "leetcodeisgreat"
 * Output: 5
 * Explanation: The longest substring is "leetc" which contains two e's.</p>
 *
 * Example 3:
 * <p>Input: s = "bcbcbc"
 * Output: 6
 * Explanation: In this case, the given string "bcbcbc" is the longest because all vowels: a, e, i, o and u appear zero times.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 5 x 10^5
 *      </li>
 *      <li>
 *          s contains only lowercase English letters.
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 17/09/2024 7:08 pm
 */
public class Solution {

    public int findTheLongestSubstring(String s) {
        int vowelsMask = 0;
        Map<Integer, Integer> vowelsMaskCache = new HashMap<>() {{
            put(0, -1);
        }};
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'a':
                    vowelsMask ^= 1;
                    break;
                case 'e':
                    vowelsMask ^= 2;
                    break;
                case 'i':
                    vowelsMask ^= 4;
                    break;
                case 'o':
                    vowelsMask ^= 8;
                    break;
                case 'u':
                    vowelsMask ^= 16;
                    break;
            }

            if (vowelsMaskCache.containsKey(vowelsMask)) {
                maxLength = Math.max(maxLength, i - vowelsMaskCache.get(vowelsMask));
            } else {
                vowelsMaskCache.put(vowelsMask, i);
            }
        }

        return maxLength;
    }
}
