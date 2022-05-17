package io.dev.codex;

// Reference online problems
// Leetcode: 2236. Root Equals Sum of Children
// https://leetcode.com/problems/root-equals-sum-of-children/
public class BinaryTreeRootEqualsSumChildrenProblem {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}


