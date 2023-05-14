package io.github.ololx.leetcode.solutions.medium.task2433;

/**
 * 2433. Find The Original Array of Prefix Xor
 *
 * You are given an integer array pref of size n. Find and return the array arr
 * of size n that satisfies:
 *
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 * Note that ^ denotes the bitwise-xor operation.
 *
 * It can be proven that the answer is unique.
 *
 * Example 1:
 * <p>Input: pref = [5,2,0,3,1]
 * Output: [5,7,2,3,2]
 * Explanation: From the array [5,7,2,3,2] we have the following:
 * - pref[0] = 5.
 * - pref[1] = 5 ^ 7 = 2.
 * - pref[2] = 5 ^ 7 ^ 2 = 0.
 * - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
 * - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.</p>
 *
 * Example 2:
 * <p>Input: pref = [13]
 * Output: [13]
 * Explanation: We have pref[0] = arr[0] = 13.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *           1 <= pref.length <= 10^5
 *      </li>
 *      <li>
 *           0 <= pref[i] <= 10^6
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 14.05.2023 12:21
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] findArray(int[] pref) {
        int[] originArray = new int[pref.length];
        originArray[0] = pref[0];

        for (int elementIndex = 1; elementIndex < pref.length; elementIndex++) {
            originArray[elementIndex] = pref[elementIndex] ^ pref[elementIndex - 1];
        }

        return originArray;
    }
}
