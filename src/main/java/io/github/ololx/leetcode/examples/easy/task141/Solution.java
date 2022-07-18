package io.github.ololx.leetcode.examples.easy.task141;

/**
 * 141. Linked List Cycle
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list
 * that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's
 * next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Example 1:
 * <p>Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list,
 * where the tail connects to the 1st node (0-indexed).</p>
 *
 * Example 2:
 * <p>Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list,
 * where the tail connects to the 0th node.</p>
 *
 * Example 3:
 * <p>Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of the nodes in the list is in the range [0, 10^4].
 *      </li>
 *      <li>
 *          -10^5 <= Node.val <= 10^5
 *      </li>
 *      <li>
 *          pos is -1 or a valid index in the linked-list.
 *      </li>
 * </ul>
 *
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 *
 * project leetcode-solutions
 * created 22.06.2022 14:30
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static final class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode jumpNode = head;

        while (jumpNode != null && jumpNode.next != null && jumpNode.next.next != null) {
            head = head.next;
            jumpNode = jumpNode.next.next.next;

            if (head == jumpNode) {
                return true;
            }
        }

        return false;
    }
}
