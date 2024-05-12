package io.github.ololx.leetcode.solutions.medium.task559;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 12/05/2024 8:23am
 */
public class SolutionTest {

    @DataProvider(name = "providesNodes")
    public static Object[][] providesNodes() {
        return new Object[][]{
            {
                new Solution.Node(
                    3,
                    List.of(
                        new Solution.Node(9),
                        new Solution.Node(20, List.of(new Solution.Node(4), new Solution.Node(7)))
                    )
                ),
                2
            },
            {
                new Solution.Node(1, Collections.singletonList(new Solution.Node(2))),
                1
            }
        };
    }

    @Test(dataProvider = "providesNodes")
    public void maxDepth_whenTreesHasNodes_thenReturnMaxDepth(Solution.Node root, int expected) {
        assertEquals(new Solution().maxDepth(root), expected);
    }
}