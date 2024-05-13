package io.github.ololx.leetcode.solutions.easy.task2706;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * project leetcode-solutions
 * created 11.06.2023 10:15
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesPricesAndMoney")
    public void testBuyChoco(int[] prices, int money, int expected) {
        Solution solution = new Solution();
        int actual = solution.buyChoco(prices, money);

        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] providesPricesAndMoney() {
        return new Object[][] {
                { new int[] {1, 2, 2}, 3, 0 },
                { new int[] {3, 2, 3}, 3, 3 },
                { new int[] {1, 1}, 3, 1 },
                { new int[] {100, 100}, 200, 0 },
                { new int[] {10, 20}, 15, 15 }
        };
    }
}
