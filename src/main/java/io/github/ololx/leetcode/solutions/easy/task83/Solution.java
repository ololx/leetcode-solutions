package io.github.ololx.leetcode.solutions.easy.task83;

import java.util.Objects;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the
 * linked list sorted as well.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example 1:
 * <p>Input: head = [1,1,2]
 * Output: [1,2]</p>
 *
 * Example 2:
 * <p>head = [1,1,2,3,3]
 * Output: [1,2,3]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         The number of nodes in the list is in the range [0, 300].
 *     </li>
 *     <li>
 *         -100 <= Node.val <= 100
 *     </li>
 *     <li>
 *         The list is guaranteed to be sorted in ascending order.
 *     </li>
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
 * created 16.04.2024 07:40
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        while (head.next != null && head.val == head.next.val) {
            head = head.next;
        }

        head.next = deleteDuplicates(head.next);

        return head;
    }

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

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof ListNode)) {
                return false;
            }

            final ListNode listNode = (ListNode) o;

            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
