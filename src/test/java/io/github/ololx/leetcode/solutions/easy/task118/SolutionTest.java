package io.github.ololx.leetcode.solutions.easy.task118;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 20.07.2022 12:23
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesRowsCount")
    public static Object[][] providesRowsCount() {
        return new Object[][] {
                {
                    5,
                        List.of(
                                 List.of(1),
                                List.of(1, 1),
                               List.of(1, 2, 1),
                              List.of(1, 3, 3, 1),
                            List.of(1, 4, 6, 4, 1)
                    )
                },
                {
                    1,
                        List.of(
                                List.of(1)
                        )

                }
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesRowsCount")
    public void generate_whenNIsMoreThanZero_thenReturnTriangle(int n, List<List<Integer>> expected) {
        assertEquals(new Solution().generate(n), expected);
    }
}
