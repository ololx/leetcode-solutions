package io.github.ololx.leetcode.solutions.easy.task14;

/**
 * 14. Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * <p>Input: strs = ["flower","flow","flight"]
 * Output: "fl"</p>
 *
 * Example 2:
 * <p>Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= strs.length <= 200
 *      </li>
 *      <li>
 *          0 <= strs[i].length <= 200
 *      </li>
 *      <li>
 *          strs[i] consists of only lower-case English letters.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 17.02.2022 12:42
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    public String longestCommonPrefix(String[] strs, int start, int end) {
        if (start >= end) {
            return strs[start];
        }

        int median = (end + start) / 2;
        String leftString = longestCommonPrefix(strs, start, median);
        String rightString = longestCommonPrefix(strs, ++median, end);

        StringBuilder prefix = new StringBuilder();
        for (int prefixIndex = 0; prefixIndex < Math.min(leftString.length(), rightString.length()); prefixIndex++) {
            if (leftString.charAt(prefixIndex) != rightString.charAt(prefixIndex)) {
                break;
            }

            prefix.append(leftString.charAt(prefixIndex));;
        }

        return prefix.toString();
    }
}
