package io.github.ololx.leetcode.solutions.easy.task104;

/**
 * 104. Maximum Depth of Binary Tree
 *
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest
 * leaf node.
 *
 * Example 1:
 * <p>Input: root = [3,9,20,null,null,15,7]
 * Output: 3</p>
 *
 * Example 2:
 * <p>Input: root = [1,null,2]
 * Output: 2</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in the tree is in the range [0, 10^4].
 *      </li>
 *      <li>
 *          -100 <= Node.val <= 100
 *      </li>
 * </ul>
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 10/05/2024 16:17am
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

    static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {this.val = val;}

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
