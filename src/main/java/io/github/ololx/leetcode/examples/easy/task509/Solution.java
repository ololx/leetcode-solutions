package io.github.ololx.leetcode.examples.easy.task509;

/**
 * project leetcode-solutions
 * created 07.07.2022 11:59
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(--n) + fib(--n);
    }
}
