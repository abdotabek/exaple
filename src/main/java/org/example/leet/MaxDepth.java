package org.example.leet;

/**Given the root of a binary tree, return its depth.
 The depth of a binary tree is defined as the number of nodes along the longest path from the root node down to the farthest leaf node.*/
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
