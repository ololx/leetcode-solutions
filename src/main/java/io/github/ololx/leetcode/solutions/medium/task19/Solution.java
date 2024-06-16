package io.github.ololx.leetcode.solutions.medium.task19;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 16/06/2024 9:13am
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        ListNode nodeBeforeNodeToDelete = head;
        var currentNodeNumber = -1;

        do {
            if (++currentNodeNumber > n) {
                nodeBeforeNodeToDelete = nodeBeforeNodeToDelete.next;
            }

            currentNode = currentNode.next;
        } while (currentNode != null);

        if (currentNodeNumber == n - 1) {
            return head.next;
        }

        if (nodeBeforeNodeToDelete != null && nodeBeforeNodeToDelete.next != null) {
            nodeBeforeNodeToDelete.next = nodeBeforeNodeToDelete.next.next;
        }

        return head;
    }
}
