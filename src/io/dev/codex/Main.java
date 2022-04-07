package io.dev.codex;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] nums = {20, 10, 30, 5, 40};
        BinarySearchTreeCustom binaryTree = new BinarySearchTreeCustom();
        for (int n : nums) {
            binaryTree.addNode(n);
        }
        binaryTree.printInorder(binaryTree.getRoot());
    }
}
