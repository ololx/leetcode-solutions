package io.github.ololx.leetcode.examples.easy.task1694;

/**
 * project leetcode-solutions
 * created 23.02.2022 13:10
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String reformatNumber(String number) {
        if (number == null) {
            return "";
        }

        StringBuilder phoneNumber = new StringBuilder();
        for (int numberDigitIndex = 0, blockSize = 0; numberDigitIndex < number.length(); numberDigitIndex++) {
            char numberDigit = number.charAt(numberDigitIndex);
            if (numberDigit == 32 || numberDigit == 45) {
                continue;
            }

            if (blockSize == 3) {
                phoneNumber.append("-");
                blockSize = 0;
            }

            phoneNumber.append(number.charAt(numberDigitIndex));
            blockSize++;
        }

        if (phoneNumber.indexOf("-", phoneNumber.length() - 2) > 0) {
            phoneNumber.deleteCharAt(phoneNumber.length() - 2);
            phoneNumber.insert(phoneNumber.length() - 2, "-");
        }

        return phoneNumber.toString();
    }
}
