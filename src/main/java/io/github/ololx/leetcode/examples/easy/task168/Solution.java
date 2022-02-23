package io.github.ololx.leetcode.examples.easy.task168;

/**
 * 168. Excel Sheet Column Title
 *
 * Given an integer columnNumber, return its corresponding column
 * title as it appears in an Excel sheet.
 *
 * For example:
 * <p>A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...</p>
 *
 * Example 1:
 * <p>Input: columnNumber = 1
 * Output: "A"</p>
 *
 * Example 2:
 * <p>Input: columnNumber = 28
 * Output: "AB"</p>
 *
 * Example 3:
 * <p>Input: columnNumber = 701
 * Output: "ZY"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= columnNumber <= 2^31 - 1
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 23.02.2022 12:45
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String convertToTitle(int columnNumber) {
        if (columnNumber == 0) {
            return "";
        }

        String title = "";
        for (int number = columnNumber; number > 0; number = number / 26) {
            char titleLetter = (char)(65 + --number % 26);
            title = titleLetter + title;
        }

        return title;
    }
}
