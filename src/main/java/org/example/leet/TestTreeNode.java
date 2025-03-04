package org.example.leet;

/**
 * You are given the root of a binary tree root. Invert the binary tree and return its root.
 * */

public class TestTreeNode {
    public TreeNode invertTree(TreeNode root) {
        // базовый случай: если корень null, возвращает null
        if (root == null) {
            return null;
        }
        // рекурсивно инвертируем левое поддерево
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // меняем местами левое и правое поддерево
        root.left = right;
        root.right = left;
        return root;

    }

}
