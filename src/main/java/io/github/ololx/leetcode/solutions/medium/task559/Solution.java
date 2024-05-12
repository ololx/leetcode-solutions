package io.github.ololx.leetcode.solutions.medium.task559;

import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 *
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 *
 * Example 1:
 * <p>Input: root = [1,null,3,2,4,null,5,6]
 * Output: 3</p>
 *
 * Example 2:
 * <p>Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * Output: 5</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The total number of nodes is in the range [0, 10^4].
 *      </li>
 *      <li>
 *          The depth of the n-ary tree is less than or equal to 1000.
 *      </li>
 * </ul>
 *
 * Definition for a Node.
 * class Node {
 *     public int val;
 *     public List<Node> children;
 *
 *     public Node() {}
 *
 *     public Node(int _val) {
 *         val = _val;
 *     }
 *
 *     public Node(int _val, List<Node> _children) {
 *         val = _val;
 *         children = _children;
 *     }
 * };
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 10/05/2024 16:17am
 */
public class Solution {

    public int maxDepth(Node root) {
        if (root == null || root.children == null) {
            return 0;
        } else if (root.children.isEmpty()) {
            return 1;
        }

        var maxDepth = 0;
        for (var node : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(node));
        }

        return maxDepth + 1;
    }

    static class Node {

        int val;

        List<Node> children;

        Node() {}

        Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
