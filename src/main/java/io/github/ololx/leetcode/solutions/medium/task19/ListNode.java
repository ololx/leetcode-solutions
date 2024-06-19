package io.github.ololx.leetcode.solutions.medium.task19;

import java.util.Objects;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 16/06/2024 9:15am
 */
class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
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

    @Override
    public String toString() {
        return "ListNode{" +
            "val=" + val +
            ", next=" + next +
            '}';
    }
}
