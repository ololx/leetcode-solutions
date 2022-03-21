package io.github.ololx.leetcode.examples.medium.task856;

import java.util.Stack;

/**
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
