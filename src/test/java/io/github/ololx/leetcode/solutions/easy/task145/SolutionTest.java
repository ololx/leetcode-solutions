package io.github.ololx.leetcode.solutions.easy.task145;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 07.09.2022 09:00
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesTreeNodesAndLists")
    public static Object[][] providesTreeNodesAndLists() {
        return new Object[][] {
                {
                    new Solution.TreeNode(
                            1,
                            null,
                            new Solution.TreeNode(
                                    2,
                                    new Solution.TreeNode(3),
                                    null
                            )
                    ),
                        List.of(3, 2, 1)
                },
                {
                    new Solution.TreeNode(1),
                        List.of(1)
                },
                {
                        null,
                        Collections.emptyList()
                },
        };
    }

    @LogParam
    @Test(dataProvider = "providesTreeNodesAndLists")
    public void postorderTraversal_whenRootIsNotNull_thenReturnAllInPostOrder(Solution.TreeNode root,
                                                                              List<Integer> expected) {
        assertEquals(new Solution().postorderTraversal(root), expected);
    }
}
