package io.github.ololx.leetcode.solutions.medium.task393;

/**
 * 393. UTF-8 Validation
 *
 * Given an integer array data representing the data, return whether
 * it is a valid UTF-8 encoding (i.e. it translates to a sequence of
 * valid UTF-8 encoded characters).
 *
 * A character in UTF8 can be from 1 to 4 bytes long, subjected
 * to the following rules:
 *
 * Number of Bytes   |        UTF-8 Octet Sequence
 *                        |              (binary)
 *    --------------------+-----------------------------------------
 *             1          |   0xxxxxxx
 *             2          |   110xxxxx 10xxxxxx
 *             3          |   1110xxxx 10xxxxxx 10xxxxxx
 *             4          |   11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
 *
 * For a 1-byte character, the first bit is a 0, followed by its Unicode code.
 * For an n-bytes character, the first n bits are all one's, the n + 1 bit is 0,
 * followed by n - 1 bytes with the most significant 2 bits being 10.
 * This is how the UTF-8 encoding would work:
 *
 * x denotes a bit in the binary form of a byte that may be either 0 or 1.
 *
 * Note: The input is an array of integers. Only the least significant 8 bits of
 * each integer is used to store the data. This means each integer
 * represents only 1 byte of data.
 *
 * Example 1:
 * <p>Input: data = [197,130,1]
 * Output: true
 * Explanation: data represents the octet sequence: 11000101 10000010 00000001.
 * It is a valid utf-8 encoding for a 2-bytes character followed by a 1-byte character.</p>
 *
 * Example 2:
 * <p>Input: data = [235,140,4]
 * Output: false
 * Explanation: data represented the octet sequence: 11101011 10001100 00000100.
 * The first 3 bits are all one's and the 4th bit is 0 means it is a 3-bytes character.
 * The next byte is a continuation byte which starts with 10 and that's correct.
 * But the second continuation byte does not start with 10, so it is invalid.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= data.length <= 2 * 10^4
 *      </li>
 *      <li>
 *          0 <= data[i] <= 255
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 25/11/2022 22:13
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean validUtf8(int[] data) {
        int size = data.length;
        if (size == 0) {
            return false;
        }

        for (int index = 0; index < size; index++) {
            int bitCount = getUnicodeBytesCount(data[index]);
            if (bitCount == -1 || size - index < bitCount) {
                return false;
            }

            for (int subIndex = 1; subIndex < bitCount; subIndex++) {
                if (getLastNBits(data[++index], 2) != 0b10) {
                    return false;
                }
            }
        }

        return true;
    }

    public int getUnicodeBytesCount(int firstByte) {
        if (getLastNBits(firstByte, 1) == 0b0) {
            return 1;
        } else if (getLastNBits(firstByte, 3) == 0b110) {
            return 2;
        } else if (getLastNBits(firstByte, 4) == 0b1110) {
            return 3;
        } else if (getLastNBits(firstByte, 5) == 0b11110) {
            return 4;
        } else {
            return -1;
        }
    }

    public int getLastNBits(int digit, int n) {
        int shift = 8 - (Math.max(n, 0));

        return ((digit >> shift) & (0b11111111 >> shift));
    }
}
