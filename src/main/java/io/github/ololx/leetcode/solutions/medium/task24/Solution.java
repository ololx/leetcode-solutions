package io.github.ololx.leetcode.solutions.medium.task24;

import java.util.Objects;

/**
 * 24. Swap Nodes in Pairs
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in
 * the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Example 1:
 * <p>Input: head = [1,2,3,4]
 * Output: [2,1,4,3]</p>
 *
 * Example 2:
 * <p>Input: head = []
 * Output: []</p>
 *
 * Example 3:
 * <p>Input: head = [1]
 * Output: [1]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in the list is in the range [0, 100].
 *      </li>
 *      <li>
 *          0 <= Node.val <= 100
 *      </li>
 * </ul>
 *
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

        ListNode headNextNext = head.next.next;
        ListNode headNext = head.next;
        ListNode headCurrent = head;

        head = headNext;
        head.next = headCurrent;

        head.next.next = swapPairs(headNextNext);

        return head;
    }

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (! (obj instanceof ListNode)) {
                return false;
            }

            ListNode otherListNode = (ListNode) obj;

            return val == otherListNode.val;
        }

        @Override
        public int hashCode() {
            int result = 31;
            result = 31 * result + val;

            if (next != null) {
                result = 31 * result + next.hashCode();
            }

            return result;
        }
    }
}
