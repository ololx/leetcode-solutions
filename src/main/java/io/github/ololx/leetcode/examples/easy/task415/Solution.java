/**
 * Copyright 2022 the project leetcode-solutions authors
 * and the original author or authors annotated by {@author}
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.ololx.leetcode.examples.easy.task415;

import java.util.Map;

/**
 * 415. Add Strings
 *
 * Given two non-negative integers, num1 and num2 represented as string,
 * return the sum of num1 and num2 as a string.
 *
 * You must solve the problem without using any built-in library
 * for handling large integers (such as BigInteger).
 * You must also not convert the inputs to integers directly.
 *
 * Example 1:
 * <p>Input: num1 = "11", num2 = "123"
 * Output: "134"</p>
 *
 * Example 2:
 * <p>Input: num1 = "456", num2 = "77"
 * Output: "533"</p>
 *
 * Example 3:
 * <p>Input: num1 = "0", num2 = "0"
 * Output: "0"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= num1.length, num2.length <= 10^4
 *      </li>
 *      <li>
 *          num1 and num2 consist of only digits.
 *      </li>
 *      <li>
 *          num1 and num2 don't have any leading zeros except for the zero itself.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 19.04.2022 22:04
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    Map<Character, Integer> numeral = Map.of(
            '0', 0,
            '1', 1,
            '2', 2,
            '3', 3,
            '4', 4,
            '5', 5,
            '6', 6,
            '7', 7,
            '8', 8,
            '9', 9
    );

    public String addStrings(String num1, String num2) {
        if (num1 == null && num2 == null) {
            return "0";
        } else if (num1 == null) {
            return num2;
        } else if (num2 == null) {
            return num1;
        }

        int length1 = num1.length();
        int length2 = num2.length();
        int minLength = length1 & ((length1 - length2) >> 31)
                | length2 & (~(length1 - length2) >> 31);

        int carry = 0;
        StringBuilder sumString = new StringBuilder();
        for (int digit = 1; digit <= minLength; digit++) {
            int sum = numeral.getOrDefault(num1.charAt(length1 - digit), 0)
                    + numeral.getOrDefault(num2.charAt(length2 - digit), 0)
                    + carry;
            sumString.insert(0, sum % 10);

            carry = sum / 10;
        }

        String rest = length1 > length2 ? num1 : num2;
        for (int digit = rest.length() - ++minLength; digit >= 0; digit--) {
            int sum = numeral.getOrDefault(rest.charAt(digit), 0) + carry;
            sumString.insert(0, sum % 10);

            carry = sum / 10;
        }

        if (carry != 0) {
            sumString.insert(0, carry);
        }

        return sumString.toString();
    }
}
