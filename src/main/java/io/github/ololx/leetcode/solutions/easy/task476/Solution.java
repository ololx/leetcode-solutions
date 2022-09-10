package io.github.ololx.leetcode.solutions.easy.task476;

/**
 * 476. Number Complement
 *
 * The complement of an integer is the integer you get when you flip
 * all the 0's to 1's and all the 1's to 0's in its binary representation.
 *
 * <p>For example, The integer 5 is "101" in binary and its complement
 * is "010" which is the integer 2.</p>
 * Given an integer n, return its complement.
 *
 * Example 1:
 * <p>Input: num = 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.</p>
 *
 * Example 2:
 * <p>Input: num = 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits),
 * and its complement is 0. So you need to output 0.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n < 2^31
 *      </li>
 * </ul>
 *
 * Note: This question is the same as 476: https://leetcode.com/problems/number-complement/
 *
 * project leetcode-solutions
 * created 26.05.2022 20:54
 *
 * @author Alexander A. Kropotin
 */
class Solution {
    public int findComplement(int num) {
        return num ^ ((1 << 1 + (int) Math.floor((Math.log(num) / Math.log(2)))) - 1);
    }
}
