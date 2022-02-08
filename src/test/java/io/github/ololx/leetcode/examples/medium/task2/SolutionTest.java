package io.github.ololx.leetcode.examples.medium.task2;

import io.github.ololx.leetcode.examples.medium.task2.Solution;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 06.02.2022 18:28
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    public void addTwoNumbers_whenTwoNumbersIsNotEmpty_thenReturnRightSumm() {
        Solution.ListNode l1 = new Solution.ListNode(
                2,
                new Solution.ListNode(4,
                        new Solution.ListNode(3)
                )
        );

        Solution.ListNode l2 = new Solution.ListNode(
                5,
                new Solution.ListNode(6,
                        new Solution.ListNode(4)
                )
        );

        Solution.ListNode lr = new Solution.ListNode(
                7,
                new Solution.ListNode(0,
                        new Solution.ListNode(8)
                )
        );

        Solution.ListNode result = new Solution().addTwoNumbers(l1, l2);

        assertEquals(result.val, lr.val);
        assertEquals(result.next.val, lr.next.val);
        assertEquals(result.next.next.val, lr.next.next.val);

        System.out.println("Result = " + result);
    }
}
