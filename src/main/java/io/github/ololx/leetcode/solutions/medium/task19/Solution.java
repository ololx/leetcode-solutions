package io.github.ololx.leetcode.solutions.medium.task19;

/**
 * 19. Remove Nth Node From End of List
 *
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * Example 1:
 * <p>Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]</p>
 *
 * Example 2:
 * <p>Input: head = [1], n = 1
 * Output: []</p>
 *
 * Example 3:
 * <p>Input: head = [1,2], n = 1
 * Output: [1]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *         The number of nodes in the list is sz.
 *      </li>
 *      <li>
 *          1 <= sz <= 30
 *      </li>
 *      <li>
 *          0 <= Node.val <= 100
 *      </li>
 *      <li>
 *          1 <= n <= sz
 *      </li>
 * </ul>
 *
 * <b>Follow up:</b> Could you do this in one pass?
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
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 16/06/2024 9:13am
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
