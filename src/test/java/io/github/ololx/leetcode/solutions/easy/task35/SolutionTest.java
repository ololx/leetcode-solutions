package io.github.ololx.leetcode.solutions.easy.task35;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 10.02.2022 12:57
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "numsAndTarget")
    public static Object[][] numsAndTarget() {
        return new Object[][] {
                {
                    new int[]{1, 3, 5, 6},
                        5,
                        2
                },
                {
                    new int[]{1, 3, 5, 6},
                        2,
                        1
                },
                {
                    new int[]{1, 3, 5, 6},
                        7,
                        4
                },
                {
                        new int[]{1, 3},
                        1,
                        0
                },
                {
                        new int[]{1, 3, 5, 6},
                        0,
                        0
                }
        };
    }

    @Test(timeOut = 3000L, dataProvider = "numsAndTarget")
    public void searchInsert_whenTargetInArrayOrNot_thenGetTargetPosOrProposePos(int[] nums, int target, int result) {
        assertEquals(
                new Solution().searchInsert(nums, target),
                result
        );
    }
}
