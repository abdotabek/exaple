package org.example.leet;

/**The diameter of a binary tree is defined as the length of the longest path between any two nodes within the tree.
 * The path does not necessarily have to pass through the root.
 The length of a path between two nodes in a binary tree is the number of edges between the nodes.
 Given the root of a binary tree root, return the diameter of the tree.*/
public class MaxDiameter {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        // Вызываем рекурсивную функцию для вычисления высоты и обновления диаметра
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node) {
        // Базовый случай если node null высота 0
        if (node == null) {
            return 0;
        }

        // Рекурсивно вычисляем высоту и левого и правого поддерева
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        //  Локальный диаметр через локальный узел = сумма высоты поддерева
        int currentDiameter = leftHeight + rightHeight;

        // Обновляем глобальный максимум диаметр
        maxDiameter = Math.max(maxDiameter, currentDiameter);

        // Возвращаем высоту текущего поддерева
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
