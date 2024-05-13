package io.github.ololx.leetcode.solutions.medium.task150;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project leetcode-solutions
 * created 09.09.2022 07:31
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesTokens")
    public static Object[][] providesTokens() {
        return new Object[][] {
                {new String[] {"2","1","+","3","*"}, 9},
                {new String[] {"4","13","5","/","+"}, 6},
                {new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}, 22},
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesTokens")
    public void findDuplicate_whenDuplicateInNums_thenReturnNum(String[] tokens, int expected) {
        assertTrue(new Solution().evalRPN(tokens) == expected);
    }
}
