package io.github.ololx.leetcode.solutions.easy.task2485;

/**
 * 2485. Find the Pivot Integer
 *
 * Given a positive integer n, find the pivot integer x such that:
 * <ol>
 *     <li>
 *         The sum of all elements between 1 and x inclusively equals
 *         the sum of all elements between x and n inclusively.
 *     </li>
 * </ol>
 * Return the pivot integer x. If no such integer exists, return -1.
 * It is guaranteed that there will be at most one pivot index for the given input.
 *
 * Example 1:
 * <p>Input: n = 8
 * Output: 6
 * Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.</p>
 *
 * Example 2:
 * <p>Input: n = 1
 * Output: 1
 * Explanation: 1 is the pivot integer since: 1 = 1.</p>
 *
 * Example 3:
 * <p>Input: n = 4
 * Output: -1
 * Explanation: It can be proved that no such integer exist.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 1000
 *      </li>
 * </ul>
 *
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
