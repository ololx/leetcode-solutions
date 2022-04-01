package io.github.ololx.leetcode.examples.medium.task1249;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 *
 * Given a string s of '(' , ')' and lowercase English characters.
 *
 * Your task is to remove the minimum number of parentheses ( '(' or ')',
 * in any positions ) so that the resulting parentheses string is valid
 * and return any valid string.
 *
 * Formally, a parentheses string is valid if and only if:
 * <ul>
 *     <li>It is the empty string, contains only lowercase characters, or</li>
 *     <li>It can be written as AB (A concatenated with B),
 *     where A and B are valid strings, or</li>
 *     <li>It can be written as (A), where A is a valid string.</li>
 * </ul>
 *
 * Example 1:
 * <p>Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.</p>
 *
 * Example 2:
 * <p>Input: s = "a)b(c)d"
 * Output: "ab(c)d"</p>
 *
 * Example 3:
 * <p>Input: s = "))(("
 * Output: ""
 * Explanation: An empty string is also valid.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^5
 *      </li>
 *      <li>
 *          s[i] is either'(' , ')', or lowercase English letter.
 *      </li>
 * </ul>
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
