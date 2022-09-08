package io.github.ololx.leetcode.solutions.easy.task461;

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
 * created 18.07.2022 15:10
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public int hammingDistance(int x, int y) {
        int[] nibbleBitCounts = new int[] {
                0,          // 0
                1, 1, 2, 1, // 1.. 4
                2, 2, 3, 1, // 5 .. 8
                2, 2, 3, 2, // 9 .. 12
                3, 3, 4, 1  // 13 .. 16
        };
        int xy = x ^ y;

        return nibbleBitCounts[0xF & xy]
                + nibbleBitCounts[0xF & (xy >> 4)]
                + nibbleBitCounts[0xF & (xy >> 8)]
                + nibbleBitCounts[0xF & (xy >> 12)]
                + nibbleBitCounts[0xF & (xy >> 16)]
                + nibbleBitCounts[0xF & (xy >> 20)]
                + nibbleBitCounts[0xF & (xy >> 24)]
                + nibbleBitCounts[0xF & (xy >> 28)];
    }
}
