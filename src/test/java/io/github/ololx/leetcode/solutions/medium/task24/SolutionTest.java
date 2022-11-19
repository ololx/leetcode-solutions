package io.github.ololx.leetcode.solutions.medium.task24;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task24.Solution;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 18/11/2022 18:22
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @LogParam
    @Test
    public void test() {
        Solution.ListNode head = new Solution.ListNode(1, new Solution.ListNode(2, new Solution.ListNode(3, new Solution.ListNode(4))));
        Solution.ListNode expected = new Solution.ListNode(2, new Solution.ListNode(1, new Solution.ListNode(4, new Solution.ListNode(1))));
        assertEquals(new Solution().swapPairs(head), expected);
    }
}
