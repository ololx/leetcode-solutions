package io.github.ololx.leetcode.examples.easy.task67;

/**
 * 67. Add Binary
 *
 * project leetcode-solutions
 * created 12.03.2022 15:44
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String addBinary(String a, String b) {
        if (a == null || a.isBlank()) {
            return b;
        } else if (b == null || b.isBlank()) {
            return a;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;
        Character x0 = '0';

        for (int aInd = a.length() - 1, bInd = b.length() - 1; aInd >= 0 || bInd >=0; aInd--, bInd--) {
            int binary = carry;

            if (aInd >= 0) {
                binary += a.charAt(aInd) - x0;
            }

            if (bInd >= 0) {
                binary += b.charAt(bInd) - x0;
            }

            carry = binary / 2;
            result.insert(0, binary % 2);
        }

        result.insert(0, carry > 0 ? carry : "");

        return result.toString();
    }
}
