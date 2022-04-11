package io.github.ololx.leetcode.examples.easy.task1598;

import io.github.ololx.leetcode.examples.easy.task1598.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 11.04.2022 22:13
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesLogs")
    public static Object[][] providesLogs() {
        return new Object[][] {
                {new String[] {"d1/","d2/","../","d21/","./"}, 2},
                {new String[] {"d1/","d2/","./","d3/","../","d31/"}, 3},
                {new String[] {"d1/","../","../","../"}, 0},
                {new String[] {"d1/","../","../","../"}, 0},
                {new String[] {"./","wz4/","../","mj2/","../","../","ik0/","il7/"}, 2}
        };
    }

    @Test(dataProvider = "providesLogs")
    public void minOperations_whenOpsIsNotNull_thenReturnNewScore(String[] logs, int expected) {
        assertEquals(new Solution().minOperations(logs), expected);
    }
}
