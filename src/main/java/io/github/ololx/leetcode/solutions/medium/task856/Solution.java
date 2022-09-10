package io.github.ololx.leetcode.solutions.medium.task856;

import java.util.Stack;

/**
 * 856. Score of Parentheses
 *
 * Given a balanced parentheses string s, return the score of the string.
 *
 * The score of a balanced parentheses string is based on the following rule:
 * <ul>
 *     <li>
 *         "()" has score 1.
 *     </li>
 *     <li>
 *         AB has score A + B, where A and B are balanced parentheses strings.
 *     </li>
 *     <li>
 *         (A) has score 2 * A, where A is a balanced parentheses string.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: s = "()"
 * Output: 1</p>
 *
 * Example 2:
 * <p>Input: s = "(())"
 * Output: 2</p>
 *
 * Example 3:
 * <p>Input: s = "()()"
 * Output: 2</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= s.length <= 50
 *      </li>
 *      <li>
 *          s consists of only '(' and ')'.
 *      </li>
 *      <li>
 *          s is a balanced parentheses string.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 20.03.2022 20:54
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int scoreOfParentheses(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }

        Stack<Integer> parentheses = new Stack<>();

        for (Character parenthesis : s.toCharArray()) {
            if (parenthesis == '(') {
                parentheses.push(0);
            } else {
                int currentWeight = parentheses.pop();
                int previousWeight = parentheses.isEmpty() ? 0 : parentheses.pop();

                parentheses.push(previousWeight + (Math.max(currentWeight * 2, 1)));
            }
        }

        return parentheses.pop();
    }
}
