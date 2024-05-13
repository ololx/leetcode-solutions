package io.github.ololx.leetcode.solutions.medium.task198;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 04/05/2024 9:07am
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesHouses")
    public static Object[][] providesHouses() {
        return new Object[][] {
            {new int[] {1, 2, 3, 1}, 4},
            {new int[] {2, 7, 9, 3, 1}, 12},
        };
    }

    //@LogParam
    @Test(dataProvider = "providesHouses")
    public void rob_whenHousesMoreThanOne_thenReturnMaxFromStreet(int[] nums, int expected) {
        assertEquals(new Solution().rob(nums), expected);
    }
}
