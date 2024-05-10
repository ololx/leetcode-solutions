package io.github.ololx.leetcode.solutions.easy.task104;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 10/05/2024 4:19pm
 */
public class SolutionTest {

    @DataProvider(name = "providesTreeNodes")
    public static Object[][] providesTreeNodes() {
        return new Object[][]{
            {
                new Solution.TreeNode(
                    3,
                    new Solution.TreeNode(9),
                    new Solution.TreeNode(
                        20,
                        new Solution.TreeNode(4),
                        new Solution.TreeNode(7)
                    )
                ),
                3
            },
            {
                new Solution.TreeNode(
                    1,
                     null,
                    new Solution.TreeNode(2)
                ),
                2
            }
        };
    }

    @Test(dataProvider = "providesTreeNodes")
    public void maxDepth_whenTreesHasNodes_thenReturnMaxDepth(Solution.TreeNode root, int expected) {
        assertEquals(new Solution().maxDepth(root), expected);
    }
}