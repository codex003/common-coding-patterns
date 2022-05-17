package io.dev.codex;

// Reference online problems
// Leetcode: 938. Range Sum of BST
// https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumBSTProblem {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        return inOrderTraversal(root, low, high);
    }

    private int inOrderTraversal(TreeNode tmp, int low, int high) {
        if(tmp == null) {
            return 0;
        }

        int result = 0;
        if(tmp.val >= low && tmp.val <= high) {
            result = tmp.val;
        }

        result = inOrderTraversal(tmp.left, low, high) + result + inOrderTraversal(tmp.right, low, high);

        return result;

    }
}
