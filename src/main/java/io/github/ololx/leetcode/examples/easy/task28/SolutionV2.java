package io.github.ololx.leetcode.examples.easy.task28;

/**
 * 28. Implement strStr()
 *
 * Implement strStr().
 *
 * Given two strings needle and haystack, return the index of
 * the first occurrence of needle in haystack, or -1
 * if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string?
 * This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle
 * is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 * Example 1:
 * <p>Input: haystack = "hello", needle = "ll"
 * Output: 2</p>
 *
 * Example 2:
 * <p>Input: haystack = "aaaaa", needle = "bba"
 * Output: -1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= haystack.length, needle.length <= 10^4
 *      </li>
 *      <li>
 *          haystack and needle consist of only lowercase English characters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 25.05.2022 12:04
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        //main loop on heystack
        for (int haystackPointer = 0; haystackPointer < haystack.length(); haystackPointer++) {
            int needlePointer = 0;

            //find first symbol position
            while (haystackPointer < haystack.length()
                    && haystack.charAt(haystackPointer) != needle.charAt(needlePointer)) {
                haystackPointer++;
            }

            //if last strStr symbol is no equal then skip
            if (haystackPointer + needle.length() - 1>= haystack.length()
                    || haystack.charAt(haystackPointer + needle.length() - 1) != needle.charAt(needle.length() - 1)) {
                continue;
            }

            //find last subStr symbol position
            while (haystackPointer < haystack.length()
                    && needlePointer < needle.length() - 1
                    && haystack.charAt(haystackPointer) == needle.charAt(needlePointer)) {
                needlePointer++;
                haystackPointer++;
            }

            if (needlePointer == needle.length() - 1) {
                return haystackPointer - needlePointer;
            }

            haystackPointer -= needlePointer;
        }

        return -1;
    }
}
