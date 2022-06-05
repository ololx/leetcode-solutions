package io.github.ololx.leetcode.examples.easy.task190;

/**
 * project leetcode-solutions
 * created 05.06.2022 21:20
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int reverseBits(int n) {
        int reversed = 0, mask = 0b1;

        for (int digit = 1; digit <= 32; digit++) {
            reversed <<= 1;
            reversed |= 0b1 ^ (mask & n);
            mask <<= digit;
        }

        return reversed;
    }
}
