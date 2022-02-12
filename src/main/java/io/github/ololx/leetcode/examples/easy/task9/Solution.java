package io.github.ololx.leetcode.examples.easy.task9;

/**
 * 9. Palindrome Number
 *
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 * <ul>
 *     <li>For example, 121 is a palindrome while 123 is not.</li>
 * </ul>
 *
 * Example 1:
 * <p>Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.</p>
 *
 * Example 2:
 * <p>Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left,
 * it becomes 121-. Therefore it is not a palindrome.</p>
 *
 * Example 3:
 * <p>Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         -2^31 <= x <= 2^31 - 1
 *     </li>
 * </ul>
 *
 * Follow up: Could you solve it without converting the integer to a string?
 *
 * project leetcode-solutions
 * created 08.02.2022 16:12
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        int length = (int) (Math.log10(x) + 1);
        if (length == 1) {
            return true;
        }

        int digit = 10;
        int reverseHalfX = x % digit;
        int digitIndex = 1;
        while (digitIndex < length / 2) {
            digit *= 10;
            reverseHalfX = (reverseHalfX * 10) + (x % digit) / (digit / 10);
            digitIndex++;
        }
        int halfX = x / (digit * ((digitIndex << 1) == length ? 1 : 10));

        return halfX == reverseHalfX;
    }
}
