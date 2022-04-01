package io.github.ololx.leetcode.examples.easy.task100;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 20.02.2022 19:22
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "treesAndAnswer")
    public static Object[][] treesAndAnswer() {
        return new Object[][] {
                {
                        new Solution.TreeNode(0,
                                new Solution.TreeNode(-5),
                                null
                        ),
                        new Solution.TreeNode(0,
                                new Solution.TreeNode(-8),
                                null
                        ),
                        false
                },
                {
                    new Solution.TreeNode(1,
                            new Solution.TreeNode(2),
                            new Solution.TreeNode(3)
                    ),
                        new Solution.TreeNode(1,
                                new Solution.TreeNode(2),
                                new Solution.TreeNode(3)
                        ),
                        true
                },
                {
                        new Solution.TreeNode(1,
                                new Solution.TreeNode(2),
                                null
                        ),
                        new Solution.TreeNode(1,
                                null,
                                new Solution.TreeNode(2)
                        ),
                        false
                },
                {
                        new Solution.TreeNode(1,
                                new Solution.TreeNode(2),
                                new Solution.TreeNode(1)
                        ),
                        new Solution.TreeNode(1,
                                new Solution.TreeNode(1),
                                new Solution.TreeNode(2)
                        ),
                        false
                }
        };
    }

    @Test(dataProvider = "treesAndAnswer")
    public void isSameTree_whenTreesAreSame_thenReturnTrue(Solution.TreeNode p,
                                                           Solution.TreeNode q,
                                                           boolean result) {
        assertEquals(new Solution().isSameTree(p, q), result);
    }
}
