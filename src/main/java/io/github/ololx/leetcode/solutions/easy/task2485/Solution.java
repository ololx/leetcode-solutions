package io.github.ololx.leetcode.solutions.easy.task2485;

/**
 * project leetcode-solutions
 * created 29/11/2022 20:42
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int pivotInteger(int n) {
        if (n <= 1) {
            return n;
        }

        int leftSum = 0, rigthSum = 0;
        for (int x = 1; x <= n; x++) {
            rigthSum += x;
        }

        for (int x = 1; x <= n; x++) {
            leftSum += x;

            if (leftSum == (rigthSum - leftSum) + x) {
                return x;
            }
        }

        return -1;
    }
}
