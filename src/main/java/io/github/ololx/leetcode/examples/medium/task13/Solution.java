package io.github.ololx.leetcode.examples.medium.task13;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two one"s added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four. The same principle applies
 * to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <ul>
 *     <li>
 *         I can be placed before V (5) and X (10) to make 4 and 9.
 *     </li>
 *     <li>
 *         X can be placed before L (50) and C (100) to make 40 and 90.
 *     </li>
 *     <li>
 *         C can be placed before D (500) and M (1000) to make 400 and 900.
 *     </li>
 * </ul>
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Example 1:
 * <p>Input: s = "III"
 * Output: 3
 * Explanation: III = 3.</p>
 *
 * Example 2:
 * <p>Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.</p>
 *
 * Example 3:
 * <p>Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 15
 *      </li>
 *      <li>
 *          s contains only the characters ("I", "V", "X", "L", "C", "D", "M").
 *      </li>
 *      <li>
 *          It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 11.02.2022 12:40
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    private static final Map<String, Integer> romanToInteger;

    static {
        romanToInteger = new HashMap<String, Integer>() {
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
                put("IV", 4);
                put("IX", 9);
                put("XL", 40);
                put("XC", 90);
                put("CD", 400);
                put("CM", 900);
            }
        };
    }

    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        } else if (s.length() < 1) {
            return 0;
        }

        String[] roman = s.split("");
        int number = 0, pointer = 0;
        while (pointer < roman.length - 1) {
            int integer = 0;
            if ((integer = romanToInteger.getOrDefault(roman[pointer] + roman[++pointer], 0)) == 0) {
                integer = romanToInteger.getOrDefault(roman[--pointer], 0);
            }

            number += integer;
            pointer++;
        }

        if (pointer < roman.length) {
            number += romanToInteger.getOrDefault(roman[--pointer], 0);
        }

        return number;
    }
}
