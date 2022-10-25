package io.github.ololx.leetcode.solutions.easy.task125;

/**
 * 125. Valid Palindrome
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
