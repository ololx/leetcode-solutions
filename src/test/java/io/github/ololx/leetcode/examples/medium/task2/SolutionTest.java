package io.github.ololx.leetcode.examples.medium.task2;

import io.github.ololx.leetcode.examples.medium.task2.Solution;
import org.testng.annotations.Test;

/**
 * project leetcode-solutions
 * created 06.02.2022 18:28
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    public void addTwoNumbers_whenTwoNumbersIsNotEmpty_thenReturnRightSumm() {
        Solution.ListNode l13 = new Solution.ListNode(3);
        Solution.ListNode l12 = new Solution.ListNode(4, l13);
        Solution.ListNode l1 = new Solution.ListNode(2, l12);

        Solution.ListNode l23 = new Solution.ListNode(4);
        Solution.ListNode l22 = new Solution.ListNode(6, l23);
        Solution.ListNode l2 = new Solution.ListNode(5, l22);

        Solution addTwoNumbersSolution = new Solution();
        Solution.ListNode result = addTwoNumbersSolution.addTwoNumbers(l1, l2);

        System.out.println("Result = " + result);
    }
}
