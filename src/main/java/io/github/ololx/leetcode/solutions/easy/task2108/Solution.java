package io.github.ololx.leetcode.solutions.easy.task2108;

/**
 * 2108. Find First Palindromic String in the Array
 *
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 *
 * A string is palindromic if it reads the same forward and backward.
 *
 * Example 1:
 * <p>Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.</p>
 *
 * Example 2:
 * <p>Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".</p>
 *
 * Example 3:
 * <p>Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is returned.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= words.length <= 100
 *      </li>
 *      <li>
 *          1 <= words[i].length <= 100
 *      </li>
 *      <li>
 *          words[i] consists only of lowercase English letters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 30.07.2022 22:25
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int originPoint = -1, inversePoint = word.length();

            while (inversePoint > 0 ) {
                if (word.charAt(++originPoint) != word.charAt(--inversePoint)) {
                    break;
                }
            }

            if (inversePoint == 0) {
                return word;
            }
        }

        return "";
    }
}
