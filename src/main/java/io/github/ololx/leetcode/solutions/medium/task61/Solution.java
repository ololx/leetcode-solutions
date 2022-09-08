package io.github.ololx.leetcode.solutions.medium.task61;

/**
 * project leetcode-solutions
 * created 11.03.2022 21:55
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = head;

        int lenght = 0;
        while (result != null) {
            result  = result.next;
            lenght++;
        }

        k = k % lenght;
        if (k == 0) {
            return head;
        }

        ListNode left = head;
        ListNode right = head;
        while(right.next != null){
            if (k <= 0) {
                left = left.next;
            }

            right = right.next;
            k--;
        }

        right.next = head;
        head = left.next;
        left.next = null;

        return head;
    }
}
