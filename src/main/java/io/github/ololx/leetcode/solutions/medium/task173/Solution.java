package io.github.ololx.leetcode.solutions.medium.task173;

import java.util.Stack;

/**
 * 173. Binary Search Tree Iterator
 *
 * Implement the BSTIterator class that represents an iterator over the in-order traversal
 * of a binary search tree (BST):
 * <ol>
 *     <li>
 *         BSTIterator(TreeNode root) Initializes an object of the BSTIterator class.
 *         The root of the BST is given as part of the constructor.
 *         The pointer should be initialized to a non-existent number smaller than any
 *         element in the BST.
 *     </li>
 *     <li>
 *         boolean hasNext() Returns true if there exists a number in the traversal to the
 *         right of the pointer, otherwise returns false.
 *     </li>
 *     <li>
 *         int next() Moves the pointer to the right, then returns the number at the pointer.
 *     </li>
 * </ol>
 *
 *  Notice that by initializing the pointer to a non-existent smallest number,
 *  the first call to next() will return the smallest element in the BST.
 *
 * You may assume that next() calls will always be valid. That is, there will be at least
 * a next number in the in-order traversal when next() is called.
 *
 * Example 1:
 * <p>Input
 * ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext",
 * "next", "hasNext"]
 * [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
 * Output
 * [null, 3, 7, true, 9, true, 15, true, 20, false]
 *
 * Explanation
 * BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
 * bSTIterator.next();    // return 3
 * bSTIterator.next();    // return 7
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 9
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 15
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 20
 * bSTIterator.hasNext(); // return False</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in the tree is in the range [1, 10^5].
 *      </li>
 *      <li>
 *          0 <= Node.val <= 10^6
 *      </li>
 *      <li>
 *          At most 10^5 calls will be made to hasNext, and next.
 *      </li>
 * </ul>
 *
 * Follow up: Could you implement next() and hasNext() to run in average O(1) time and
 * use O(h) memory, where h is the height of the tree?
 *
 * project leetcode-solutions
 * created 31.12.2022 13:01
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class BSTIterator {
        private Stack<TreeNode> leftNodes = new Stack<>();

        public BSTIterator(TreeNode root) {
            this.walkOnLeft(root);
        }

        private void walkOnLeft(TreeNode root) {
            while (root != null) {
                leftNodes.push(root);
                root = root.left;
            }
        }

        public int next() {
            if (!hasNext()) {
                return -1;
            }

            TreeNode currentNode = this.leftNodes.pop();
            this.walkOnLeft(currentNode.right);

            return currentNode.val;
        }

        public boolean hasNext() {
            return !this.leftNodes.empty();
        }
    }

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
    }
}
