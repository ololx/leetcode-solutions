/**
 * Copyright 2024 the project leetcode-solutions authors
 * and the original author or authors annotated by {@author}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ololx.leetcode.solutions.easy.task112;

/**
 * 112. Path Sum
 *
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals targetSum.
 *
 * A leaf is a node with no children.
 *
 * Example 1:
 * <p>Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.</p>
 *
 * Example 2:
 * <p>Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.</p>
 *
 * Example 3:
 * <p>Input: root = [], targetSum = 0
 * Output: false
 * Explanation: Since the tree is empty, there are no root-to-leaf paths.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          The number of nodes in the tree is in the range [0, 5000].
 *      </li>
 *      <li>
 *          -1000 <= Node.val <= 1000
 *      </li>
 *      <li>
 *          -1000 <= targetSum <= 1000
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
 *     created 09/05/2024 12:44pm
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static class TreeNode {

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
}
