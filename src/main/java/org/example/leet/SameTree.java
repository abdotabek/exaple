package org.example.leet;

/**Given the roots of two binary trees p and q, return true if the trees are equivalent, otherwise return false.
 Two binary trees are considered equivalent if they share the exact same structure and the nodes have the same values.*/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
