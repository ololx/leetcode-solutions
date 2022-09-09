package io.github.ololx.leetcode.solutions.medium.task150;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

/**
 * 150. Evaluate Reverse Polish Notation
 *
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 *
 * Note that division between two integers should truncate toward zero.
 *
 * It is guaranteed that the given RPN expression is always valid.
 * That means the expression would always evaluate to a result, and there will not
 * be any division by zero operation.
 *
 * Example 1:
 * <p>Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9</p>
 *
 * Example 2:
 * <p>Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6</p>
 *
 * Example 3:
 * <p>Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= tokens.length <= 10^4
 *     </li>
 *     <li>
 *         tokens[i] is either an operator: "+", "-", "*", or "/",
 *         or an integer in the range [-200, 200].
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 08.09.2022 21:10
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    private static final Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<>() {{
        put("+", (a, b) -> a + b);
        put("-", (a, b) -> a - b);
        put("/", (a, b) -> a / b);
        put("*", (a, b) -> a * b);
    }};

    private static final Map<String, Integer> digits = new HashMap<>() {{
        for (int digit = -200; digit <= 200; digit++) {
            put(String.valueOf(digit), digit);
        }
    }};

    public int evalRPN(String[] tokens) {
        Stack<Integer> evaluations = new Stack<>();

        for (String token : tokens) {
            if (!evaluations.isEmpty() && operators.containsKey(token)) {
                int b = evaluations.pop();
                int a = evaluations.pop();

                evaluations.push(operators.get(token).apply(a, b));
            } else {
                evaluations.push(digits.get(token));
            }
        }

        return evaluations.peek();
    }
}
