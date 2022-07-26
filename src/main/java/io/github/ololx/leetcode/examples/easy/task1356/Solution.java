package io.github.ololx.leetcode.examples.easy.task1356;

/**
 * 1356. Sort Integers by The Number of 1 Bits
 *
 *
 *
 * project leetcode-solutions
 * created 26.07.2022 09:22
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    private static final int[] NIBBLE_BIT_COUNTS = new int[] {
            0,          // 0
            1, 1, 2, 1, // 1.. 4
            2, 2, 3, 1, // 5 .. 8
            2, 2, 3, 2, // 9 .. 12
            3, 3, 4, 1  // 13 .. 16
    };

    public int hammingWeight(int x) {
        return NIBBLE_BIT_COUNTS[0xF & x]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 4)]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 8)]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 12)]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 16)];
    }

    public int[] sortByBits(int[] arr) {

        return new int[0];
    }
}
