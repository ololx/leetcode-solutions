package io.github.ololx.leetcode.examples.medium.task82;

/**
 * project leetcode-solutions
 * created 09.03.2022 18:43
 *
 * @author Alexander A. Kropotin
 */
public class ListNode {

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
