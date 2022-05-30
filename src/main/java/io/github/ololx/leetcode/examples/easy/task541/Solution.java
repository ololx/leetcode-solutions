package io.github.ololx.leetcode.examples.easy.task541;

/**
 * project leetcode-solutions
 * created 30.05.2022 21:46
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String reverseStr(String s, int k) {
        int leftPointer = 0, rightPointer = k - 1;
        StringBuilder reversedString = new StringBuilder();

        while (rightPointer >= leftPointer) {
            reversedString.append(s.charAt(rightPointer));
            rightPointer--;
        }

        while (k < s.length()) {
            reversedString.append(s.charAt(k));
            k++;
        }

        return reversedString.toString();
    }
}
