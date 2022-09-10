package io.github.ololx.leetcode.solutions.easy.task231;

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
 * created 06.05.2022 14:31
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
