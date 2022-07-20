package io.github.ololx.leetcode.examples.easy.task1694;

/**
 * 1694. Reformat Phone Number
 *
 * You are given a phone number as a string number. number consists of digits,
 * spaces ' ', and/or dashes '-'.
 *
 * You would like to reformat the phone number in a certain manner.
 * Firstly, remove all spaces and dashes. Then, group the digits from left to right
 * into blocks of length 3 until there are 4 or fewer digits. The final digits are
 * then grouped as follows:
 * <ul>
 *     <ol>
 *         2 digits: A single block of length 2.
 *     </ol>
 *     <ol>
 *         3 digits: A single block of length 3.
 *     </ol>
 *     <ol>
 *         4 digits: Two blocks of length 2 each.
 *     </ol>
 * </ul>
 *
 * The blocks are then joined by dashes. Notice that the reformatting process
 * should never produce any blocks of length 1 and produce at most two blocks of length 2.
 *
 * Return the phone number after formatting.
 *
 * Example 1:
 * <p>Input: number = "1-23-45 6"
 * Output: "123-456"
 * Explanation: The digits are "123456".
 * Step 1: There are more than 4 digits, so group the next 3 digits.
 * The 1st block is "123".
 * Step 2: There are 3 digits remaining, so put them in a single block of length 3.
 * The 2nd block is "456".
 * Joining the blocks gives "123-456".</p>
 *
 * Example 2:
 * <p>Input: number = "123 4-567"
 * Output: "123-45-67"
 * Explanation: The digits are "1234567".
 * Step 1: There are more than 4 digits, so group the next 3 digits.
 * The 1st block is "123".
 * Step 2: There are 4 digits left, so split them into two blocks of length 2.
 * The blocks are "45" and "67".
 * Joining the blocks gives "123-45-67".</p>
 *
 * Example 3:
 * <p>Input: number = "123 4-5678"
 * Output: "123-456-78"
 * Explanation: The digits are "12345678".
 * Step 1: The 1st block is "123".
 * Step 2: The 2nd block is "456".
 * Step 3: There are 2 digits left, so put them in a single block of length 2.
 * The 3rd block is "78".
 * Joining the blocks gives "123-456-78".</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= number.length <= 100
 *      </li>
 *      <li>
 *          number consists of digits and the characters '-' and ' '.
 *      </li>
 *      <li>
 *          There are at least two digits in number.
 *      </li>
 * </ul>
 *
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
