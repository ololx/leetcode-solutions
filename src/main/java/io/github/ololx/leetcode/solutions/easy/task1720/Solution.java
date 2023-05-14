package io.github.ololx.leetcode.solutions.easy.task1720;

/**
 * 1720. Decode XORed Array
 *
 * There is a hidden integer array arr that consists of n non-negative integers.
 *
 * It was encoded into another integer array encoded of length n - 1, such that
 * encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then
 * encoded = [1,2,3].
 *
 * You are given the encoded array. You are also given an integer first, that
 * is the first element of arr, i.e. arr[0].
 *
 * Return the original array arr. It can be proved that the answer exists and
 * is unique.
 *
 * Return the merged string.
 *
 * Example 1:
 * <p>Input: encoded = [1,2,3], first = 1
 * Output: [1,0,2,1]
 * Explanation: If arr = [1,0,2,1], then first = 1 and
 * encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]</p>
 *
 * Example 2:
 * <p>Input: encoded = [6,2,7,3], first = 4
 * Output: [4,2,0,7,4]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *           2 <= n <= 10^4
 *      </li>
 *      <li>
 *           encoded.length == n - 1
 *      </li>
 *      <li>
 *           0 <= encoded[i] <= 10^5
 *      </li>
 *      <li>
 *           0 <= first <= 10^5
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 14.05.2023 11:49
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;

        for (int elementIndex = 0; elementIndex < encoded.length; elementIndex++) {
            decoded[elementIndex + 1] = encoded[elementIndex] ^ decoded[elementIndex];
        }

        return decoded;
    }
}
