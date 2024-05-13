package io.github.ololx.leetcode.solutions.medium.task114;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 10.09.2022 08:10
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesTreeNodes")
    public static Object[][] providesTreeNodes() {
        return new Object[][] {
                {
                        new Solution.TreeNode(
                                1,
                                new Solution.TreeNode(
                                        2,
                                        new Solution.TreeNode(3),
                                        new Solution.TreeNode(4)
                                ),
                                new Solution.TreeNode(
                                        5,
                                        null,
                                        new Solution.TreeNode(6)
                                )
                        ),
                        new Solution.TreeNode(
                                1,
                                null,
                                new Solution.TreeNode(
                                        2,
                                        null,
                                        new Solution.TreeNode(
                                                3,
                                                null,
                                                new Solution.TreeNode(
                                                        4,
                                                        null,
                                                        new Solution.TreeNode(
                                                                5,
                                                                null,
                                                                new Solution.TreeNode(
                                                                        6,
                                                                        null,
                                                                        null
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                },
                {
                    null,
                    null
                },
                {
                        new Solution.TreeNode(0),
                        new Solution.TreeNode(0)
                }

        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesTreeNodes")
    public void flatten_whenRootIsNotNull_thenReturnAllFlatten(Solution.TreeNode root,
                                                               Solution.TreeNode expected) {
        new Solution().flatten(root);
        assertEquals(root, expected);
    }
}
