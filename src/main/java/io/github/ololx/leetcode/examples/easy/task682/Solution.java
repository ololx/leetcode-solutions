package io.github.ololx.leetcode.examples.easy.task682;

import java.util.Stack;

/**
 * 682. Baseball Game
 *
 * You are keeping score for a baseball game with strange rules.
 * The game consists of several rounds, where the scores of past
 * rounds may affect future rounds' scores.
 *
 * At the beginning of the game, you start with an empty record.
 * You are given a list of strings ops, where ops[i] is the ith operation
 * you must apply to the record and is one of the following:
 * <ul>
 *      <li>
 *          An integer x - Record a new score of x.
 *      </li>
 *      <li>
 *          "+" - Record a new score that is the sum of the previous
 *          two scores. It is guaranteed there will always be two previous scores.
 *      </li>
 *      <li>
 *          "D" - Record a new score that is double the previous score.
 *          It is guaranteed there will always be a previous score.
 *      </li>
 *      <li>
 *          "C" - Invalidate the previous score, removing it from the record.
 *          It is guaranteed there will always be a previous score.
 *      </li>
 * </ul>
 * Return the sum of all the scores on the record.
 *
 * Example 1:
 * <p>Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "2" - Add 2 to the record, record is now [5, 2].
 * "C" - Invalidate and remove the previous score, record is now [5].
 * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
 * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
 * The total sum is 5 + 10 + 15 = 30.</p>
 *
 * Example 2:
 * <p>Input: ops = ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "-2" - Add -2 to the record, record is now [5, -2].
 * "4" - Add 4 to the record, record is now [5, -2, 4].
 * "C" - Invalidate and remove the previous score, record is now [5, -2].
 * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
 * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
 * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
 * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
 * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.</p>
 *
 * Example 3:
 * <p>Input: ops = ["1"]
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= ops.length <= 1000
 *      </li>
 *      <li>
 *          ops[i] is "C", "D", "+", or a string representing
 *          an integer in the range [-3 * 10^4, 3 * 10^4].
 *      </li>
 *      <li>
 *          For operation "+", there will always be at least
 *          two previous scores on the record.
 *      </li>
 *      <li>
 *          For operations "C" and "D", there will always be
 *          at least one previous score on the record.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 11.04.2022 21:36
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int calPoints(String[] ops) {
        if (ops == null) {
            return 0;
        }

        Stack<Integer> digits = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    digits.pop();
                    break;
                case "D":
                    digits.push(digits.peek() << 1);
                    break;
                case "+":
                    int pre = digits.pop();
                    int last = pre + digits.peek();
                    digits.push(pre);
                    digits.push(last);
                    break;
                default:
                    digits.push(Integer.valueOf(op));
            }
        }

        return digits.parallelStream()
                .reduce(Integer::sum)
                .orElse(0);
    }
}
