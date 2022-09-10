package io.github.ololx.leetcode.solutions.medium.task82;

/**
 * 82. Remove Duplicates from Sorted List II
 *
 * Given the head of a sorted linked list, delete all nodes that have
 * duplicate numbers, leaving only distinct numbers from the original list.
 * Return the linked list sorted as well.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example 1:
 * <p>Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]</p>
 *
 * Example 2:
 * <p>Input: head = [1,1,1,2,3]
 * Output: [2,3]</p>
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
 * created 09.03.2022 18:43
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

        if (head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }

            return deleteDuplicates(head.next);
        }

        head.next = deleteDuplicates(head.next);

        return head;
    }
}
