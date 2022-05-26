package io.github.ololx.leetcode.examples.easy.task476;

import io.github.ololx.leetcode.examples.easy.task476.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 26.05.2022 20:57
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNum")
    public static Object[][] providesNum() {
        return new Object[][] {
                {5, 2},
                {1, 0}
        };
    }

    @Test(dataProvider = "providesNum")
    public void findComplement_whenNumHasComplementMoreThenZero_thenReturnNonZeroNum(int num, int expected) {
        assertEquals(new Solution().findComplement(num), expected);
    }
}
