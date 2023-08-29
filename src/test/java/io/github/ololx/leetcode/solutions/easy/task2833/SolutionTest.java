package io.github.ololx.leetcode.solutions.easy.task2833;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.08.2023 09:28
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesMoves() {
        return new Object[][]{
                {"L_RL__R", 3},
                {"_R__LL_", 5},
                {"_______", 7},
        };
    }

    @LogParam
    @Test(dataProvider = "providesMoves")
    public void search_whenNumsContainsTarget_thenReturnTarget(String moves, int expected) {
        assertEquals(new Solution().furthestDistanceFromOrigin(moves), expected);
    }
}
