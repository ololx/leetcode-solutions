package io.github.ololx.leetcode.solutions.easy.task830;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 09.10.2022 21:20
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void largeGroupPositions_whenStringWithGroups_thenReturnPositions(String s, List<List<Integer>> expected) {
        assertEquals(new Solution().largeGroupPositions(s), expected);
    }
}
