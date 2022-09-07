package io.github.ololx.leetcode.examples.easy.task145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. Binary Tree Postorder Traversal
 *
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 *
 * Example 1:
 * <p>Input: root = [1,null,2,3]
 * Output: [3,2,1]</p>
 *
 * Example 2:
 * <p>Input: root = []
 * Output: []</p>
 *
 * Example 3:
 * <p>Input: root = [1]
 * Output: [1]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of the nodes in the tree is in the range [0, 100].
 *      </li>
 *      <li>
 *          -100 <= Node.val <= 100
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 06.09.2022 20:58
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Stack<TreeNode> tempNodes = new Stack<>();
        TreeNode currentNode = root;

        while(!tempNodes.isEmpty() || currentNode != null) {
            while(currentNode != null) {
                tempNodes.push(currentNode);
                values.add(0, currentNode.val);
                currentNode = currentNode.right;
            }

            TreeNode node = tempNodes.pop();
            currentNode = node.left;
        }

        return values;
    }

    public static final class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

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
    }
}
