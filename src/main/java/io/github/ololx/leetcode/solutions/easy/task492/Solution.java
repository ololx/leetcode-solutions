package io.github.ololx.leetcode.solutions.easy.task492;

/**
 * project leetcode-solutions
 * created 01.11.2022 21:44
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area) + 1;

        while (--w > 0) {
            int l = area / w;

            if (l * w == area) {
                return new int[] {l, w};
            }
        }

        return new int[] {area, 1};
    }
}
