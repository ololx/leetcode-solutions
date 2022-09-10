package io.github.ololx.leetcode.solutions.easy.task206;

/**
 * 206. Reverse Linked List
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * <p>Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]</p>
 *
 * Example 2:
 * <p>Input: head = [1,2]
 * Output: [2,1]</p>
 *
 * Example 3:
 * <p>Input: head = []
 * Output: []</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in the list is the range [0, 5000].
 *      </li>
 *      <li>
 *          -5000 <= Node.val <= 5000
 *      </li>
 * </ul>
 *
 * Follow up: A linked list can be reversed either iteratively or recursively.
 * Could you implement both?
 *
 * project leetcode-solutions
 * created 21.07.2022 20:45
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

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

            return val == otherListNode.val
                    && (
                            (next == null && next == otherListNode.next)
                                    || next.equals(otherListNode.next)
            );
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

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }


        ListNode current = new ListNode(head.val);
        while ((head = head.next) != null) {
            ListNode next = new ListNode(head.val, current);
            current = next;
        }

        return current;
    }
}
