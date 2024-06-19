package io.github.ololx.leetcode.solutions.medium.task19;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 19/06/2024 10:02am
 */
public class SolutionTest {

    @DataProvider(name = "providesHeadAndElementNumber")
    public static Object[][] providesHeadAndElementNumber() {
        return new Object[][]{
            {
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                2,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))
            },
            {
                new ListNode(1),
                1,
                null
            },
            {
                new ListNode(1, new ListNode(2)),
                1,
                new ListNode(1)
            }
        };
    }

    @LogParam
    @Test(
        timeOut = 3000L,
        dataProvider = "providesHeadAndElementNumber"
    )
    public void testRemoveNthFromEnd(ListNode head, int n, ListNode expected) {
        assertEquals(new Solution().removeNthFromEnd(head, n), expected);
    }
}