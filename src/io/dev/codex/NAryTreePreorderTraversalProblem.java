package io.dev.codex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Reference online problems
// Leetcode: 589. N-ary Tree Preorder Traversal
// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
public class NAryTreePreorderTraversalProblem {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        PreOrderTraversal(root, result);
        return result;
    }

    private void PreOrderTraversal(Node tmp, List<Integer> result) {
        if (tmp == null) {
            return;
        }
        result.add(tmp.val);
        for(Node node : tmp.children) {
            PreOrderTraversal(node, result);
        }
    }

    public List<Integer> preorderStackImpl(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if(root == null) {
            return result;
        }

        stack.push(root);

        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            result.add(curr.val);
            if(curr.children != null) {
                for (int i = curr.children.size() - 1; i >= 0; i--) {
                    stack.push(curr.children.get(i));
                }
            }
        }
        return result;
    }

}
