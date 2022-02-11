package io.github.ololx.leetcode.examples.medium.task12;

import java.util.HashMap;
import java.util.Map;

/**
 * 12. Integer to Roman
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
