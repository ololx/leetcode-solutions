package io.github.ololx.leetcode.solutions.medium.task24;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 18/11/2022 18:22
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesListNodes")
    public static Object[][] providesListNodes() {
        return new Object[][] {
                {
                        new Solution.ListNode(
                                1,
                                new Solution.ListNode(
                                        2,
                                        new Solution.ListNode(
                                                3,
                                                new Solution.ListNode(4)
                                        )
                                )
                        ),
                        new Solution.ListNode(
                                2,
                                new Solution.ListNode(
                                        1,
                                        new Solution.ListNode(
                                                4,
                                                new Solution.ListNode(1)
                                        )
                                )
                        ),
                },
                {
                        new Solution.ListNode(),
                        new Solution.ListNode(),
                },
                {
                        new Solution.ListNode(1),
                        new Solution.ListNode(1),
                }
        };
    }

    //@LogParam
    @Test(dataProvider = "providesListNodes")
    public void swapPairs_whenPairsExists_thenSwapListNodes(Solution.ListNode head,
                                                            Solution.ListNode expected) {
        assertEquals(new Solution().swapPairs(head), expected);
    }
}
