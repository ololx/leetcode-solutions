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
            Character numberDigit = number.charAt(numberDigitIndex);
            if (numberDigit == 32 || numberDigit == 45) {
                continue;
            }

            blockSize++;
            if (blockSize > 3) {
                phoneNumber.append((char) 45);
                blockSize = 1;
            }

            phoneNumber.append(number.charAt(numberDigitIndex));

        }

        return phoneNumber.toString();
    }
}
