package io.github.ololx.leetcode.solutions.easy.task292;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.02.2022 15:46
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "stones")
    public static Object[][] stones() {
        return new Object[][] {
                {1, true},
                {2, true},
                {16, false}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "stones")
    public void canWinNim_whenStonesAreNotAMultipleOfFour_thenReturnTrue(int stones , boolean canWin) {
        assertEquals(new Solution().canWinNim(stones), canWin);
    }
}
