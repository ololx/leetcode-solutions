package io.github.ololx.leetcode.solutions.easy.task492;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 03.11.2022 15:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesSquaresArea")
    public static Object[][] providesSquaresArea() {
        return new Object[][] {
                {4, new int[] {2, 2}},
                {37, new int[] {37, 1}},
                {122122, new int[] {427,286}}
        };
    }

    //@LogParam
    @Test(dataProvider = "providesSquaresArea")
    public void constructRectangle_whenAreaIsNotZero_thenReturnRectangle(int area, int[] expected) {
        assertEquals(new Solution().constructRectangle(area), expected);
    }
}
