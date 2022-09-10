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
 * created 09.07.2022 17:38
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int distance = 0;

        while (x > 0 || y > 0) {
            distance += ((x & 0x1) ^ (y & 0x1));
            x >>= 1;
            y >>= 1;
        }

        return distance;
    }
}
