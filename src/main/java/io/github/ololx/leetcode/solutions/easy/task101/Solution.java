package io.github.ololx.leetcode.solutions.easy.task101;

/**
 * 101. Symmetric Tree
 *
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Example 1:
 * <p>Input: root = [1,2,2,3,4,4,3]
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: root = [1,2,2,null,3,null,3]
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in the tree is in the range [1, 1000]
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
 * <b>Follow up:</b> Could you solve it both recursively and iteratively?
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 08/05/2024 11:37am
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
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
