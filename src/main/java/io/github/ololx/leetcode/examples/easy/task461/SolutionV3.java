package io.github.ololx.leetcode.examples.easy.task461;

/**
 * 461. Hamming Distance
 *
 * The Hamming distance between two integers is the number of
 * positions at which the corresponding bits are different.
 *
 * Given two integers x and y, return the Hamming distance between them.
 *
 * Example 1:
 * <p>Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.</p>
 *
 * Example 2:
 * <p>Input: x = 3, y = 1
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= x, y <= 2^31 - 1
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 18.07.2022 15:15
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV3 {

    public int hammingDistance(int x, int y) {
        // Get XOR between X and Y
        // Hamming Distance between X and Y  == Hamming Weight of XY
        int i = x ^ y;
        // Calculate Hamming Weight via
        // Devide And Conquer approach
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);

        return (((i + (i >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24;
    }
}
