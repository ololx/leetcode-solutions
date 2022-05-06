package io.github.ololx.leetcode.examples.easy.task191;

/**
 * 191. Number of 1 Bits
 *
 * Write a function that takes an unsigned integer and returns
 * the number of '1' bits it has (also known as the Hamming weight).
 *
 * Note:
 * <ul>
 *     <li>
 *         Note that in some languages, such as Java, there
 *         is no unsigned integer type. In this case, the input will be given
 *         as a signed integer type. It should not affect your implementation,
 *         as the integer's internal binary representation is the same,
 *         whether it is signed or unsigned.
 *     </li>
 *     <li>
 *         In Java, the compiler represents the signed integers
 *         using 2's complement notation. Therefore, in Example 3,
 *         the input represents the signed integer. -3.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: n = 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011
 * has a total of three '1' bits.</p>
 *
 * Example 2:
 * <p>Input: n = 00000000000000000000000010000000
 * Output: 1
 * Explanation: The input binary string 00000000000000000000000010000000
 * has a total of one '1' bit.</p>
 *
 * Example 3:
 * <p>Input: n = 11111111111111111111111111111101
 * Output: 31
 * Explanation: The input binary string 11111111111111111111111111111101
 * has a total of thirty one '1' bits.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The input must be a binary string of length 32.
 *      </li>
 * </ul>
 *
 * Follow up: If this function is called many times, how would you optimize it?
 *
 * project leetcode-solutions
 * created 06.05.2022 13:54
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int weight = 0;

        for (int currentDigit = 0; currentDigit < 32; currentDigit++) {
            weight += 0x1 & (n >> currentDigit);
        }

        return weight;
    }
}
