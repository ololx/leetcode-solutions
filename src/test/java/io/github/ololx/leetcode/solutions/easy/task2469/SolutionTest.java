package io.github.ololx.leetcode.solutions.easy.task2469;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.easy.task2469.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 16/11/2022 16:15
 * 
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesTemperatures")
    public static Object[][] providesTemperatures() {
        return new Object[][] {
                {36.50, new double[] {309.65000, 97.70000}},
                {122.11, new double[] {395.26000, 251.79800}}
        };
    }

    @LogParam
    @Test(dataProvider = "providesTemperatures")
    public void convertTemperature_whenInvokeWithCelsius_thenReturnConvertedPair(double t,
                                                                                 double[] expected) {
        assertEquals(new Solution().convertTemperature(t), expected);
    }
}
