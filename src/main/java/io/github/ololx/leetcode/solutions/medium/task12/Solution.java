package io.github.ololx.leetcode.solutions.medium.task12;

import java.util.HashMap;
import java.util.Map;

/**
 * 12. Integer to Roman
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
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
 * which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However,
 * the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four. The same principle
 * applies to the number nine, which is written as IX. There are six instances
 * where subtraction is used:
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
 * Given an integer, convert it to a roman numeral.
 *
 * Example 1:
 * <p>Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.</p>
 *
 * Example 2:
 * <p>Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.</p>
 *
 * Example 3:
 * <p>Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= num <= 3999
 *      </li>
 * </ul>
 *
 *
 * project leetcode-solutions
 * created 11.02.2022 18:58
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    private static final Map<Integer, String> integerToRoman;

    static {
        integerToRoman = new HashMap<Integer, String>() {
            {
                put(1, "I");
                put(5, "V");
                put(10, "X");
                put(50, "L");
                put(100, "C");
                put(500, "D");
                put(1000, "M");
                put(4, "IV");
                put(9, "IX");
                put(40, "XL");
                put(90, "XC");
                put(400, "CD");
                put(900, "CM");
            }
        };
    }

    public String intToRoman(int num) {
        if (num == 0) {
            return null;
        }

        int length = (int) (Math.log10(num) + 1);

        String number = "";
        int digit = 1;
        for (int index = 1; index <= length; index++) {
            digit *= 10;
            int integer = (num % digit) / (digit / 10) * (digit / 10);

            String roman = integerToRoman.getOrDefault(integer, "");
            if (!roman.isEmpty()) {
                number = roman + number;
                continue;
            }

            int hint = integer / (digit / 10);
            if (hint < 9) {
                if (hint > 5) {
                    roman += integerToRoman.get(5 * (digit / 10));
                    hint -= 5;
                }

                while (hint > 0) {
                    roman += integerToRoman.getOrDefault(digit / 10, "" );
                    hint--;
                }
            }

            number = roman + number;
        }

        return number;
    }
}
