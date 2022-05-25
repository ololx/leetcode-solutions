package io.github.ololx.leetcode.examples.easy.task344;

/**
 * 344. Reverse String
 *
 * Write a function that reverses a string. The input string
 * is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 * <p>Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]</p>
 *
 * Example 2:
 * <p>Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]</p>
 *
 * Example 3:
 * <p>Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^5
 *      </li>
 *      <li>
 *          s[i] is a printable ascii character.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 25.05.2022 05:16
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public void reverseString(char[] s) {
        int leftIndex = -1, rightIndex = s.length;

        while (++leftIndex < --rightIndex) {
            s[leftIndex] ^= s[rightIndex];
            s[rightIndex] ^= s[leftIndex];
            s[leftIndex] ^= s[rightIndex];
        }
    }
}
