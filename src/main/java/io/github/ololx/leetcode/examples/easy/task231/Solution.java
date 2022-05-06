package io.github.ololx.leetcode.examples.easy.task231;

/**
 * 231. Power of Two
 *
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 *
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 *
 * Example 1:
 * <p>Input: n = 1
 * Output: true
 * Explanation: 20 = 1</p>
 *
 * Example 2:
 * <p>Input: n = 16
 * Output: true
 * Explanation: 24 = 16</p>
 *
 * Example 3:
 * <p>Input: n = 3
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          -2^31 <= n <= 2^31 - 1
 *      </li>
 * </ul>
 *
 * Follow up: Could you solve it without loops/recursion?
 *
 * project leetcode-solutions
 * created 06.05.2022 14:15
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }

        int weight = 0;
        int currentDigit = 0;
        while (currentDigit < 32 && weight <= 1) {
            weight += 0x1 & (n >> currentDigit);
            currentDigit++;
        }

        return weight == 1;
    }
}
