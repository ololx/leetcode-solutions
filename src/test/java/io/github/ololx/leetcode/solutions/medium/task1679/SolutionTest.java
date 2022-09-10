package io.github.ololx.leetcode.solutions.medium.task1679;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 04.05.2022 20:21
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumsAndK")
    public static Object[][] providesNumsAndK() {
        return new Object[][] {
                {new int[] {1, 2, 3, 4}, 5, 2},
                {new int[] {3, 1, 3, 4, 3}, 6, 1},
                {new int[] {2, 2, 2, 3, 1, 1, 4, 1}, 4, 2},
                {new int[] {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3, 4},
        };
    }

    @Test(dataProvider = "providesNumsAndK")
    public void maxOperations_whenNumsContainsSumOfTwoEqualsK_thenReturnCountOfDeleteOperations(int[] nums, int k, int expected) {
        assertEquals(new Solution().maxOperations(nums, k), expected);
    }
}
