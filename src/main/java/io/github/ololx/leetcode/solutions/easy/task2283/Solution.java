package io.github.ololx.leetcode.solutions.easy.task2283;

/**
 * 2283. Check if Number Has Equal Digit Count and Digit Value
 *
 * You are given a 0-indexed string num of length n consisting of digits.
 *
 * Return true if for every index i in the range 0 <= i < n,
 * the digit i occurs num[i] times in num, otherwise return false.
 *
 * Example 1:
 * <p>Input: num = "1210"
 * Output: true
 * Explanation:
 * num[0] = '1'. The digit 0 occurs once in num.
 * num[1] = '2'. The digit 1 occurs twice in num.
 * num[2] = '1'. The digit 2 occurs once in num.
 * num[3] = '0'. The digit 3 occurs zero times in num.
 * The condition holds true for every index in "1210", so return true.</p>
 *
 * Example 2:
 * <p>Input: num = "030"
 * Output: false
 * Explanation:
 * num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
 * num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
 * num[2] = '0'. The digit 2 occurs zero times in num.
 * The indices 0 and 1 both violate the condition, so return false.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          n == num.length
 *      </li>
 *      <li>
 *          1 <= n <= 10
 *      </li>
 *      <li>
 *          num consists of digits.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 26.12.2022 20:55
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean digitCount(String num) {
        final int[] digitsFrequency = new int[10];

        for (int digitIndex = 0; digitIndex < num.length(); digitIndex++) {
            digitsFrequency[num.charAt(digitIndex) - 48]++;
        }

        for (int digitIndex = 0; digitIndex < num.length(); digitIndex++) {
            if (digitsFrequency[digitIndex] != num.charAt(digitIndex) - 48) {
                return false;
            }
        }

        return true;
    }
}
