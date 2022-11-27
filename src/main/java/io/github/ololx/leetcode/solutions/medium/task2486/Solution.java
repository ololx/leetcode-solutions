package io.github.ololx.leetcode.solutions.medium.task2486;

/**
 * project leetcode-solutions
 * created 27/11/2022 20:17
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int appendCharacters(String s, String t) {
        int sPointer = -1, tPointer = 0;

        while (++sPointer < s.length() && tPointer < t.length()) {
            while (s.charAt(sPointer) == t.charAt(tPointer)) {
                tPointer++;
            }
        }

        return t.length() - tPointer;
    }
}
