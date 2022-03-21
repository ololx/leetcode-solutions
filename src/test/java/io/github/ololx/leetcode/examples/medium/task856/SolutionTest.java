package io.github.ololx.leetcode.examples.medium.task856;

import io.github.ololx.leetcode.examples.medium.task856.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
 * created 20.03.2022 21:02
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesParentheses")
    public static Object[][] providesParentheses() {
        return new Object[][] {
                {"(())", 2},
                {"(()(()))", 6},
                {"()", 1},
                {"()()", 2}
        };
    }

    @Test(dataProvider = "providesParentheses")
    public void scoreOfParentheses_whenStringIsNotNull_thenParenthesesCount(String s, int expected) {
        assertEquals(new Solution().scoreOfParentheses(s), expected);
    }
}
