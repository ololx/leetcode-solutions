package io.github.ololx.leetcode.examples.easy.task190;

/**
 * 190. Reverse Bits
 *
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Note:
 * <ul>
 *     <li>
 *         Note that in some languages, such as Java, there is no unsigned integer type.
 *         In this case, both input and output will be given as a signed integer type.
 *         They should not affect your implementation, as the integer's internal
 *         binary representation is the same, whether it is signed or unsigned.
 *     </li>
 *     <li>
 *         In Java, the compiler represents the signed integers using 2's complement notation.
 *         Therefore, in Example 2 above, the input represents the signed integer -3
 *         and the output represents the signed integer -1073741825.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: n = 00000010100101000001111010011100
 * Output:    964176192 (00111001011110000010100101000000)
 * Explanation: The input binary string 00000010100101000001111010011100
 * represents the unsigned integer 43261596, so return 964176192
 * which its binary representation is 00111001011110000010100101000000.</p>
 *
 * Example 2:
 * <p>Input: n = 11111111111111111111111111111101
 * Output:   3221225471 (10111111111111111111111111111111)
 * Explanation: The input binary string 11111111111111111111111111111101
 * represents the unsigned integer 4294967293, so return 3221225471
 * which its binary representation is 10111111111111111111111111111111.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The input must be a binary string of length 32
 *      </li>
 * </ul>
 *
 * Follow up: If this function is called many times, how would you optimize it?
 *
 * project leetcode-solutions
 * created 05.06.2022 21:20
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int reverseBits(int n) {
        int reversed = 0, digit = -1;

        while (++digit < 32) {
            reversed <<= 1;
            reversed |= n & 0b1;
            n >>= 1;
        }

        return reversed;
    }
}