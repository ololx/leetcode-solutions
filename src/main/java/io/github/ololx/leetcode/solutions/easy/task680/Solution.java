package io.github.ololx.leetcode.solutions.easy.task680;

/**
 * 680. Valid Palindrome II
 *
 * Given a string s, return true if the s can be palindrome after deleting at most
 * one character from it.
 *
 * Example 1:
 * <p>Input: s = "aba"
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.</p>
 *
 * Example 3:
 * <p>Input: s = "abc"
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^5
 *      </li>
 *      <li>
 *          s consists of lowercase English letters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 27.10.2022 12:57
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean validPalindrome(String s) {
        int leftPointer = 0, rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return checkOnPollindrome(s, leftPointer + 1, rightPointer) || checkOnPollindrome(s, leftPointer, rightPointer - 1);
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    private static boolean checkOnPollindrome(String s, int leftPointer, int rightPointer) {
        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
