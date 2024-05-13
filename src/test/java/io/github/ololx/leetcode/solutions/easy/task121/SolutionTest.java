package io.github.ololx.leetcode.solutions.easy.task121;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 05/05/2024 9:39 am
 */
public class SolutionTest {

    @DataProvider(name = "providesPrices")
    public static Object[][] providesPrices() {
        return new Object[][] {
            {new int[] {7, 1, 5, 3, 6, 4}, 5},
            {new int[] {7, 6, 4, 3, 1}, 0},
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesPrices")
    public void maxProfit_whenMinPriceNotALastElement_thenReturnProfitMoreThanZero(int[] prices, int expected) {
        assertEquals(new Solution().maxProfit(prices), expected);
    }
}
