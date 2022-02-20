package io.github.ololx.leetcode.examples.easy.task100;

/**
 * 100. Same Tree
 *
 * Example 1:
 * <p>Input: p = [1,2,3], q = [1,2,3]
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: p = [1,2], q = [1,null,2]
 * Output: false</p>
 *
 * Example 3:
 * <p>Input: p = [1,2,1], q = [1,1,2]
 * Output: false</p>
 *
 * Given the roots of two binary trees p and q, write a function to check
 * if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical,
 * and the nodes have the same value.
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in both trees is in the range [0, 100].
 *      </li>
 *      <li>
 *          -10^4 <= Node.val <= 10^4
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
 * project leetcode-solutions
 * created 20.02.2022 19:13
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class TreeNode {
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
            String str = String.valueOf(this.val);

            if (this.left != null) {
                str += ", " + this.left.toString();
            }

            if (this.right != null) {
                str += ", " + this.right.toString();
            }

            return str;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
