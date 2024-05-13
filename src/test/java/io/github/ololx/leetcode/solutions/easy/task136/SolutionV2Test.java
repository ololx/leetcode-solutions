package io.github.ololx.leetcode.solutions.easy.task136;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.05.2022 21:10
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2Test {

    @DataProvider(name = "nums")
    public static Object[][] nums() {
        return new Object[][] {
                {new int[]{2,2,1}, 1},
                {new int[]{4,1,2,1,2}, 4},
                {new int[]{1}, 1}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "nums")
    public void singleNumber_whenArrayIsNotEmpty_thenReturnUniqueNumber(int[] nums, int singleNumber) {
        assertEquals(new SolutionV2().singleNumber(nums), singleNumber);
    }
}
