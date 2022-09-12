package io.github.ololx.leetcode.solutions.medium.task430;

import java.util.Stack;

/**
 * project leetcode-solutions
 * created 12.09.2022 07:22
 * 
 * @author Alexander A. Kropotin
 */
public class Solution {

    public Node flatten(Node head) {
        Stack<Node> tempNodes = new Stack<>();
        Node currentNode = head;

        while (!tempNodes.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                tempNodes.push(currentNode.child);
                currentNode = currentNode.next;

                if (currentNode != null) {
                    head.child = null;
                    head.next = currentNode;
                    head.prev = head;
                    head = head.next;
                }
            }

            currentNode = tempNodes.pop();
        }

        while (head.prev != null) {
            head = head.prev;
        }

        return head;
    }

    public static final class Node {

        public int val;

        public Node prev;

        public Node next;

        public Node child;

        @Override
        public String toString() {
            return String.format(
                    "[%s, %s, %s]",
                    this.val,
                    this.next != null ? this.next.toString() : null,
                    this.child != null ? this.child.toString() : null
            );
        }
    };
}
