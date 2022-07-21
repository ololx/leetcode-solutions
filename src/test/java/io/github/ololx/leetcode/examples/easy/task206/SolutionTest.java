package io.github.ololx.leetcode.examples.easy.task206;

import io.github.ololx.leetcode.examples.easy.task206.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 21.07.2022 20:48
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesListNodes")
    public static Object[][] providesListNodes() {
        return new Object[][] {
                {new Solution.ListNode(), new Solution.ListNode()},
                {
                    new Solution.ListNode(1, new Solution.ListNode(2)),
                        new Solution.ListNode(2, new Solution.ListNode(1))
                },
                {
                    new Solution.ListNode(
                            1,
                            new Solution.ListNode(
                                    2,
                                    new Solution.ListNode(
                                            3,
                                            new Solution.ListNode(
                                                    4,
                                                    new Solution.ListNode(5)
                                            )
                                    )
                            )
                    ),
                        new Solution.ListNode(
                                5,
                                new Solution.ListNode(
                                        4,
                                        new Solution.ListNode(
                                                3,
                                                new Solution.ListNode(
                                                        2,
                                                        new Solution.ListNode(1)
                                                )
                                        )
                                )
                        )
                }
        };
    }

    @Test(dataProvider = "providesListNodes")
    public void reverseList_whenListNodeISNOtNull_thenReturnReversedListNode(Solution.ListNode head,
                                                                             Solution.ListNode expected) {
        assertEquals(new Solution().reverseList(head), expected);
    }
}
