package io.github.ololx.leetcode.solutions.easy.task21;

/**
 * 21. Merge Two Sorted Lists
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Example 1:
 * <p>Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]</p>
 *
 * Example 2:
 * <p>Input: list1 = [], list2 = []
 * Output: []</p>
 *
 * Example 3:
 * <p>Input: list1 = [], list2 = [0]
 * Output: [0]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in both lists is in the range [0, 50].
 *      </li>
 *      <li>
 *          -100 <= Node.val <= 100
 *      </li>
 *      <li>
 *          Both list1 and list2 are sorted in non-decreasing order.
 *      </li>
 * </ul>
 *
 *
 * project leetcode-solutions
 * created 13.03.2022 20:35
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class ListNode {

        public static ListNode newInstance(int[] values) {
            return newInstance(values, 0);
        }

        private static ListNode newInstance(int[] values, int pos) {
            if (values == null || values.length == 0 || pos >= values.length) {
                return null;
            }

            return new ListNode(values[pos], newInstance(values, pos + 1));
        }

        int val;

        ListNode next;

        ListNode() {
        }

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode mergedListNode = list1;
        if (mergedListNode.val < list2.val) {
            mergedListNode.next = mergeTwoLists(list1.next, list2);

        } else {
            mergedListNode = list2;
            mergedListNode.next = mergeTwoLists(list1, list2.next);
        }

        return mergedListNode;
    }
}
