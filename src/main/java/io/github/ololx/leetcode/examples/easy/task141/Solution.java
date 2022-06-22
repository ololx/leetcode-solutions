package io.github.ololx.leetcode.examples.easy.task141;

/**
 * project leetcode-solutions
 * created 22.06.2022 14:30
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static final class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode jumpNode = head;

        while (jumpNode != null && jumpNode.next != null && jumpNode.next.next != null) {
            head = head.next;
            jumpNode = jumpNode.next.next.next;

            if (head == jumpNode) {
                return true;
            }
        }

        return false;
    }
}
