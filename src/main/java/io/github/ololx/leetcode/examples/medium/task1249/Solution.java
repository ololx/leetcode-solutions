package io.github.ololx.leetcode.examples.medium.task1249;

import java.util.*;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 *
 * project leetcode-solutions
 * created 15.03.2022 22:22
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public String minRemoveToMakeValid(String s) {
        if (s == null || s.isBlank()) {
            return "";
        }

        Stack<Integer> parentheses = new Stack<>();
        Set<Integer> badPositions = new HashSet<>();
        String[] symbols = s.split("");
        for (int bracketIndex = 0; bracketIndex < symbols.length; bracketIndex++) {
            if ("(".equals(symbols[bracketIndex])) {
                parentheses.push(bracketIndex);
            }

            if (")".equals(symbols[bracketIndex])) {
                if (parentheses.isEmpty()) {
                    badPositions.add(bracketIndex);
                } else {
                    parentheses.pop();
                }
            }
        }

        while (!parentheses.isEmpty()) {
            badPositions.add(parentheses.pop());
        }

        StringBuilder result = new StringBuilder();
        for (int charIndex = 0; charIndex < symbols.length; charIndex++) {
            if (badPositions.contains(charIndex)) {
                continue;
            }

            result.append(symbols[charIndex]);
        }

        return result.toString();
    }
}
