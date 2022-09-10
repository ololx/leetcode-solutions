package io.github.ololx.leetcode.solutions.medium.task114;

import java.util.Stack;

/**
 * 114. Flatten Binary Tree to Linked List
 *
 * Given the root of a binary tree, flatten the tree into a "linked list":
 * <ul>
 *     <ol>
 *         The "linked list" should use the same TreeNode class where the right
 *         child pointer points to the next node in the list and
 *         the left child pointer is always null.
 *     </ol>
 *     <ol>
 *         The "linked list" should be in the same order as a pre-order traversal of
 *         the binary tree.
 *     </ol>
 * </ul>
 *
 * Example 1:
 * <p>Input: root = [1,2,5,3,4,null,6]
 * Output: [1,null,2,null,3,null,4,null,5,null,6]</p>
 *
 * Example 2:
 * <p>Input: root = []
 * Output: []</p>
 *
 * Example 3:
 * <p>Input: root = [0]
 * Output: [0]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         The number of nodes in the tree is in the range [0, 2000].
 *     </li>
 *     <li>
 *         -100 <= Node.val <= 100
 *     </li>
 * </ul>
 *
 * Follow up: Can you flatten the tree in-place (with O(1) extra space)?
 *
 * project leetcode-solutions
 * created 10.09.2022 08:09
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public void flatten(TreeNode root) {
        Stack<TreeNode> tempNodes = new Stack<>();
        TreeNode currentNode = root;
        int i = 0;
        while (!tempNodes.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                tempNodes.push(currentNode.right);
                currentNode = currentNode.left;

                if (currentNode != null) {
                    root.left = null;
                    root.right = currentNode;
                    root = root.right;
                }
            }

            currentNode = tempNodes.pop();

            if (currentNode != null) {
                root.left = null;
                root.right = currentNode;
                root = root.right;
            }
        }
    }

    public static final class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return String.format(
                    "[%s, %s, %s]",
                    this.val,
                    this.left != null ? this.left.toString() : null,
                    this.right != null ? this.right.toString() : null
            );
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof TreeNode)) return false;

            TreeNode other = (TreeNode) obj;

            if (val != other.val) {
                return false;
            }

            if (left != null ? !left.equals(other.left) : other.left != null) {
                return false;
            }

            return right != null ? right.equals(other.right) : other.right == null;
        }

        @Override
        public int hashCode() {
            int result = val;
            result = 31 * result + (left != null ? left.hashCode() : 0);
            result = 31 * result + (right != null ? right.hashCode() : 0);

            return result;
        }
    }
}
