package io.github.ololx.leetcode.solutions.medium.task393;

public class Solution {

    public boolean validUtf8(int[] data) {
        int size = data.length;
        if (size == 0) {
            return false;
        }

        int bitCount = getUnicodeBytesCount(data[0]);
        if (bitCount == -1 || size < bitCount) {
            return false;
        } else if (bitCount == 1) {
            return true;
        }

        for (int index = 1; index < bitCount; index++) {
            if (getLastNBits(data[index], 2) != 2) {
                return false;
            }
        }

        return getLastNBits(data[Math.min(bitCount, size -1)], 2) == 2;
    }

    public int getUnicodeBytesCount(int firstByte) {
        if (getLastNBits(firstByte,2) == 0) {
            return 1;
        } else if (getLastNBits(firstByte, 3) == 6) {
            return 2;
        } else if (getLastNBits(firstByte, 4) == 14) {
            return 3;
        } else if (getLastNBits(firstByte, 5) == 30) {
            return 4;
        } else {
            return -1;
        }
    }

    public int getLastNBits(int digit, int n) {
        int shift = 8 - (Math.max(n, 0));

        return ((digit >> shift) & (255 >> shift));
    }
}
