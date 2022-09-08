package io.github.ololx.leetcode.solutions.easy.task1356;

/**
 * 1356. Sort Integers by The Number of 1 Bits
 *
 * You are given an integer array arr. Sort the integers in the array in
 * ascending order by the number of 1's in their binary representation
 * and in case of two or more integers have the same number of 1's
 * you have to sort them in ascending order.
 *
 * Return the array after sorting it.
 *
 * Example 1:
 * <p>Input: arr = [0,1,2,3,4,5,6,7,8]
 * Output: [0,1,2,4,8,3,5,6,7]
 * Explantion: [0] is the only integer with 0 bits.
 * [1,2,4,8] all have 1 bit.
 * [3,5,6] have 2 bits.
 * [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]</p>
 *
 * Example 2:
 * <p>Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * Explantion: All integers have 1 bit in the binary representation,
 * you should just sort them in ascending order.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= arr.length <= 500
 *      </li>
 *      <li>
 *          0 <= arr[i] <= 10^4
 *      </li>
 * </ul>
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

    private int hammingWeight(int x) {
        return NIBBLE_BIT_COUNTS[0xF & x]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 4)]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 8)]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 12)]
                + NIBBLE_BIT_COUNTS[0xF & (x >> 16)];
    }

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (this.hammingWeight(arr[i]) > this.hammingWeight(arr[j])) {
                    arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                } else if (this.hammingWeight(arr[i]) == this.hammingWeight(arr[j])) {
                    if (arr[i] > arr[j]) {
                        arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                    }
                }
            }
        }

        return arr;
    }
}
