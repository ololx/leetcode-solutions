package io.github.ololx.leetcode.solutions.easy.task20;

import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 * <ol>
 *     <il>
 *         Open brackets must be closed by the same type of brackets.
 *     </il>
 *     <il>
 *         Open brackets must be closed in the correct order.
 *     </il>
 *</ol>
 *
 * Example 1:
 * <p>Input: s = "()"
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: s = "()[]{}"
 * Output: true</p>
 *
 * Example 3:
 * <p>Input: s = "(]"
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 10^4
 *      </li>
 *      <li>
 *          s consists of parentheses only '()[]{}'.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 18.02.2022 16:09
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    private static final Map<Character, Character> openBracketsToClosedBrackets;

    static {
        openBracketsToClosedBrackets = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );
    }

    public boolean isValid(String s) {
        if (s == null || s.isBlank()) {
            return false;
        }

        Stack<Character> parentheses = new Stack<>();
        for (int bracketIndex = 0; bracketIndex < s.length(); bracketIndex++) {
            Character originBracket = s.charAt(bracketIndex);
            Character closingBracket = openBracketsToClosedBrackets.get(originBracket);

            if (closingBracket != null) {
                parentheses.push(closingBracket);
                continue;
            }

            if (parentheses.empty() || parentheses.pop() != originBracket) {
                return false;
            }
        }

        return parentheses.empty();
    }
}
