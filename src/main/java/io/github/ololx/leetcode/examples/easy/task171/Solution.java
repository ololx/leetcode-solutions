package io.github.ololx.leetcode.examples.easy.task171;

/**
 * 171. Excel Sheet Column Number
 *
 * Given a string columnTitle that represents the column title as appear
 * in an Excel sheet, return its corresponding column number.
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
 * <p>Input: columnTitle = "A"
 * Output: 1</p>
 *
 * Example 2:
 * <p>Input: columnTitle = "AB"
 * Output: 28</p>
 *
 * Example 3:
 * <p>Input: columnTitle = "ZY"
 * Output: 701</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= columnTitle.length <= 7
 *      </li>
 *      <li>
 *          columnTitle consists only of uppercase English letters.
 *      </li>
 *      <li>
 *          columnTitle is in the range ["A", "FXSHRXW"].
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 22.02.2022 20:35
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int titleToNumber(String columnTitle) {
        if (columnTitle == null || columnTitle.isBlank()) {
            return 0;
        }

        int number = 0;
        for (int symbolIndex = 0; symbolIndex < columnTitle.length(); symbolIndex++) {
            number = number * 26 + columnTitle.charAt(symbolIndex) - 'A' + 1;
        }

        return number;
    }
}
