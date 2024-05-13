package io.github.ololx.leetcode.solutions.medium.task229;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 14.09.2022 08:33
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {3, 2, 3}, List.of(3)},
                {new int[] {1}, List.of(1)},
                {new int[] {1, 2}, List.of(1, 2)},
        };
    }

    //@LogParam
    @Test(dataProvider = "providesNums")
    public void majorityElement_whenNumsIsNotNull_thenReturnMajorityElements(int[] nums,
                                                                             List<Integer> expected) {
        assertEquals(new Solution().majorityElement(nums), expected);
    }
}
