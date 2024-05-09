package io.github.ololx.leetcode.solutions.easy.task101;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 08/05/2024 3:25pm
 */
public class SolutionTest {

    @DataProvider(name = "providesTreeNodes")
    public static Object[][] providesTreeNodes() {
        return new Object[][]{
            {
                new Solution.TreeNode(
                    1,
                    new Solution.TreeNode(
                        2,
                        new Solution.TreeNode(3),
                        new Solution.TreeNode(4)
                    ),
                    new Solution.TreeNode(
                        2,
                        new Solution.TreeNode(4),
                        new Solution.TreeNode(3)
                    )
                ),
                true
            },
            {
                new Solution.TreeNode(
                    1,
                    new Solution.TreeNode(
                        2,
                        null,
                        new Solution.TreeNode(4)
                    ),
                    new Solution.TreeNode(
                        2,
                        null,
                        new Solution.TreeNode(3)
                    )
                ),
                false
            },
            {
                new Solution.TreeNode(
                    1,
                    new Solution.TreeNode(
                        2,
                        new Solution.TreeNode(3),
                        new Solution.TreeNode(4)
                    ),
                    new Solution.TreeNode(
                        2,
                        new Solution.TreeNode(3),
                        new Solution.TreeNode(4)
                    )
                ),
                false
            }
        };
    }

    @Test(dataProvider = "providesTreeNodes")
    public void isSymmetric_whenTreesIsSymmetric_thenReturnTrue(Solution.TreeNode root, boolean expected) {
        assertEquals(new Solution().isSymmetric(root), expected);
    }
}
