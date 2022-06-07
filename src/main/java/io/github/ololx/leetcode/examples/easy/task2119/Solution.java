package io.github.ololx.leetcode.examples.easy.task2119;

/**
 * 2119. A Number After a Double Reversal
 *
 * Reversing an integer means to reverse all its digits.
 * <ul>
 *     <li>
 *         For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
 *     </li>
 * </ul>
 *
 * Given an integer num, reverse num to get reversed1, then reverse reversed1
 * to get reversed2. Return true if reversed2 equals num.
 * Otherwise return false.
 *
 * Example 1:
 * <p>Input: num = 526
 * Output: true
 * Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.</p>
 *
 * Example 2:
 * <p>Input: num = 1800
 * Output: false
 * Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.</p>
 *
 * Example 3:
 * <p>Input: num = 0
 * Output: true
 * Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= num <= 10^6
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 07.06.2022 13:09
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}
