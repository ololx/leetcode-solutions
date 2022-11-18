package io.github.ololx.leetcode.solutions.easy.task24;

/**
 * project leetcode-solutions
 * created 18/11/2022 18:16
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        newHead.next = head;

        System.out.println("1 - " + head.val + "-" + head.next.val);
        head = head.next.next;


        System.out.println("2 - " + head.val + "-" + head.next.val);

        if (head != null) {
            newHead.next.next = swapPairs(head);
        }

        return newHead;
    }

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
