package io.github.ololx.leetcode.solutions.easy.task112;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 09/05/2024 12:49 pm
 */
public class SolutionTest {

    @DataProvider(name = "providesTreeNodes")
    public static Object[][] providesTreeNodes() {
        return new Object[][]{
            {
                new Solution.TreeNode(
                    5,
                    new Solution.TreeNode(
                        4,
                        new Solution.TreeNode(
                            11,
                            new Solution.TreeNode(7),
                            new Solution.TreeNode(2)
                        ),
                        null
                    ),
                    new Solution.TreeNode(
                        8,
                        new Solution.TreeNode(13),
                        new Solution.TreeNode(
                            4,
                            null,
                            new Solution.TreeNode(1)
                        )
                    )
                ),
                22,
                true
            },
            {
                new Solution.TreeNode(
                    1,
                    new Solution.TreeNode(2),
                    new Solution.TreeNode(3)
                ),
                5,
                false
            },
            {
                null,
                0,
                false
            }
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesTreeNodes")
    public void hasPathSum_whenTargetSummFromRootToEndExists_thenReturnTrue(Solution.TreeNode root, int targetSum, boolean expected) {
        assertEquals(new Solution().hasPathSum(root, targetSum), expected);
    }
}