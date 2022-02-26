package io.github.ololx.leetcode.examples.medium.task6;

/**
 * 6. Zigzag Conversion
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font
 * for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 * Example 1:
 * <p>Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"</p>
 *
 * Example 2:
 * <p>Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I</p>
 *
 * Example 3:
 * <p>Input: s = "A", numRows = 1
 * Output: "A"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 1000
 *      </li>
 *      <li>
 *          s consists of English letters (lower-case and upper-case), ',' and '.'
 *      </li>
 *      <li>
 *          1 <= numRows <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 26.02.2022 11:33
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String convert(String s, int numRows) {
        if (s == null || s.isBlank() || numRows <= 0) {
            return "";
        }

        if (s.length() <= numRows || numRows == 1) {
            return s;
        }

        StringBuilder zigZagString = new StringBuilder();
        int left = 0, right = numRows - 1;
        while (left < numRows) {
            for (int mainPosition = left, zigPosition = left + (right - left) * 2; mainPosition < s.length(); mainPosition += (right * 2), zigPosition += (right * 2)) {
                zigZagString.append(s.charAt(mainPosition));

                if (left > 0 && zigPosition > 0 && zigPosition != mainPosition && zigPosition < s.length()) {
                    zigZagString.append(s.charAt(zigPosition));
                }

            }

            left++;
        }

        return zigZagString.toString();
    }
}
