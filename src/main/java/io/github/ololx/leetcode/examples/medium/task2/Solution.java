package io.github.ololx.leetcode.examples.medium.task2;

/**
 * 2. Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains
 * a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in each linked list is in the range [1, 100].
 *      </li>
 *      <li>
 *          0 <= Node.val <= 9
 *      </li>
 *      <li>
 *          It is guaranteed that the list represents a number that does not have leading zeros.
 *      </li>
 * </ul>
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 * project leetcode-solutions
 * created 06.02.2022 17:40
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public static class ListNode {
        int val;

        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            String str = String.valueOf(this.val);
            if (this.next != null) {
                str += ", " + this.next.toString();
            }

            return str;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode summNode = new ListNode(l1.val + l2.val);
        if (summNode.val > 9) {
            summNode.next = new ListNode(summNode.val / 10);
            summNode.val = summNode.val % 10;
        }

        if (l1.next == null && l2.next == null) {
            return summNode;
        }

        if (l1.next == null) {
            l1.next = new ListNode(0);
        }

        if (l2.next == null) {
            l2.next = new ListNode(0);
        }

        if (summNode.next != null) {
            l1.next.val += summNode.next.val;
        }

        summNode.next = addTwoNumbers(l1.next, l2.next);

        return summNode;
    }
}
