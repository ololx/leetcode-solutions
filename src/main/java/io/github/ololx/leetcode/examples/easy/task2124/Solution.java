package io.github.ololx.leetcode.examples.easy.task2124;

/**
 * 2124. Check if All A's Appears Before All B's
 *
 * project leetcode-solutions
 * created 13.02.2022 17:15
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean checkString(String s) {
        if (s == null || s.length() < 1 || s.length() > 100) {
            return false;
        }

        boolean isBfacedBefore = false;

        int pointer = 0;
        while(pointer < s.length()) {
            Character currChar = s.charAt(pointer);
            if (!currChar.equals('a') && !currChar.equals('b')) {
                return false;
            }

            if (currChar.equals('a') && isBfacedBefore) {
                return false;
            }

            if (currChar.equals('b')) {
                isBfacedBefore = true;
            }

            pointer++;
        }

        return true;
    }
}
