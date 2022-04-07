package io.dev.codex;

public class BinarySearchTreeCustom {

    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    private Node root;

    public BinarySearchTreeCustom() {
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(int input) {
        if(root == null) {
            root = new Node(input);
        } else {
            boolean found = false;
            Node tmp = root;
            while(!found) {
                if(input < tmp.data) {
                    if(tmp.left == null) {
                        found = true;
                        tmp.left = new Node(input);
                    } else {
                        tmp = tmp.left;
                    }
                } else if(input > tmp.data) {
                    if(tmp.right == null) {
                        found = true;
                        tmp.right = new Node(input);
                    } else {
                        tmp = tmp.right;
                    }
                } else {
                    found = true; // duplicate node
                }
            }
        }
    }

    // Given a binary tree, print its nodes in inorder
    public void printInorder(Node node) {
        if(node == null) {
            return;
        }

        // visit left subtree
        printInorder(node.left);

        // then print the data of node
        System.out.print(node.data + " ");

        // now traverse on right subtree
        printInorder(node.right);

    }

}
