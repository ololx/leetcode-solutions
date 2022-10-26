package io.github.ololx.leetcode.solutions.easy.task125;

/**
 * 125. Valid Palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example1 :
 * <p>Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.</p>
 *
 * Example 2:
 * <p>Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.</p>
 *
 * Example 3:
 * <p>Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= s.length <= 2 * 10^5
 *     </li>
 *     <li>
 *         s consists only of printable ASCII characters.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 25.10.2022 23:27
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isPalindrome(String s) {
        int leftPointer = 0, rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer) {
            char left = s.charAt(leftPointer), right = s.charAt(rightPointer);

            if (left > 64 && left < 97) {
                left += 32;
            }

            if (right > 64 && right < 97) {
                right += 32;
            }


            if (left < 48 || left > 57 && left < 97 || left > 122) {
                leftPointer++;
                continue;
            }

            if (right < 48 || right > 57 && right < 97 || right > 122) {
                rightPointer--;
                continue;
            }

            if (left != right) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
