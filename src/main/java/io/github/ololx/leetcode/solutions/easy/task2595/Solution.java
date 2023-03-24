package io.github.ololx.leetcode.solutions.easy.task2595;

/**
 * 2595. Number of Even and Odd Bits
 *
 * You are given a positive integer n.
 *
 * Let even denote the number of even indices in the binary representation of
 * n (0-indexed) with value 1.
 *
 * Let odd denote the number of odd indices in the binary representation of n
 * (0-indexed) with value 1.
 *
 * Return an integer array answer where answer = [even, odd].
 *
 * Example 1:
 * <p>Input: n = 17
 * Output: [2,0]
 * Explanation: The binary representation of 17 is 10001.
 * It contains 1 on the 0th and 4th indices.
 * There are 2 even and 0 odd indices.</p>
 *
 * Example 2:
 * <p>Input: n = 2
 * Output: [0,1]
 * Explanation: The binary representation of 2 is 10.
 * It contains 1 on the 1st index.
 * There are 0 even and 1 odd indices.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 24.03.2023 09:49
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] evenOddBit(int n) {
        int evenCount = 0;
        int oddCount = 0;

        for (int evenBitPosition = 0, oddBitPosition = 1; oddBitPosition < 32; evenBitPosition += 2, oddBitPosition += 2) {
            evenCount += 0x1 & (n >> evenBitPosition);
            oddCount += 0x1 & (n >> oddBitPosition);
        }

        return new int[] {evenCount, oddCount};
    }
}
