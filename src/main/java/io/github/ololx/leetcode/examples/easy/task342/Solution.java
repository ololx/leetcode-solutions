package io.github.ololx.leetcode.examples.easy.task342;

/**
 * 342. Power of Four
 *
 * Given an integer n, return true if it is a power of four.
 * Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an
 * integer x such that n == 4^x.
 *
 * Example 1:
 * <p>Input: n = 16
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: n = 5
 * Output: false</p>
 *
 * Example 3:
 * <p>Input: n = 1
 * Output: true</p>
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
 * created 15.05.2022 17:37
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        return ((n & (n - 1)) == 0) && (n & 0xAAAAAAAA) == 0;
    }
}
