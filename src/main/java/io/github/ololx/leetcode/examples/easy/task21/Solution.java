package io.github.ololx.leetcode.examples.easy.task21;

/**
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
