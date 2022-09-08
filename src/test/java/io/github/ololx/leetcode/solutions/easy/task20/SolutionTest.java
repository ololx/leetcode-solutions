package io.github.ololx.leetcode.solutions.easy.task20;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 18.02.2022 16:21
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "parenthesesAndResult")
    public static Object[][] parenthesesAndResult() {
        return new Object[][] {
                {"([{}])", true},
                {"([]{})", true},
                {"()[]{}", true},
                {"[]", true},
                {"{}", true},
                {"()", true},
                {"(}", false},
                {"(", false},
                {"]", false}
        };
    }

    @Test(dataProvider = "parenthesesAndResult")
    public void isValid_whenParenthesesIsValid_thenReturnTrue(String parentheses , boolean result) {
        assertEquals(new Solution().isValid(parentheses), result);
    }
}
