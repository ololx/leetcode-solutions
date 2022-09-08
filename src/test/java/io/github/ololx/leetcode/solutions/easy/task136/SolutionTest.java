package io.github.ololx.leetcode.solutions.easy.task136;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.02.2022 10:40
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "nums")
    public static Object[][] nums() {
        return new Object[][] {
                {new int[]{2,2,1}, 1},
                {new int[]{4,1,2,1,2}, 4},
                {new int[]{1}, 1}
        };
    }

    @Test(dataProvider = "nums")
    public void singleNumber_whenArrayIsNotEmpty_thenReturnUniqueNumber(int[] nums, int singleNumber) {
        assertEquals(new Solution().singleNumber(nums), singleNumber);
    }
}
