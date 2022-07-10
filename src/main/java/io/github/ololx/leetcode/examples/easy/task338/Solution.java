package io.github.ololx.leetcode.examples.easy.task338;

/**
 * 338. Counting Bits
 *
 * Given an integer n, return an array ans of length n + 1 such that
 * for each i (0 <= i <= n), ans[i] is the number of 1's
 * in the binary representation of i.
 *
 * Example 1:
 * <p>Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10</p>
 *
 * Example 2:
 * <p>Input: n = 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.</p>
 *
 * Example 3:
 * <p>Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= n <= 10^5
 *      </li>
 * </ul>
 *
 * Follow up:
 * <ul>
 *      <li>
 *          It is very easy to come up with a solution with a runtime of O(n log n).
 *          Can you do it in linear time O(n) and possibly in a single pass?
 *      </li>
 *      <li>
 *          Can you do it without using any built-in
 *          function (i.e., like __builtin_popcount in C++)?
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 10.07.2022 14:31
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int numIndex = 0; numIndex <= n; numIndex++) {
            int num = numIndex;

            while (num > 0) {
                ans[numIndex] += num & 0x1;
                num >>= 1;
            }
        }

        return ans;
    }
}
