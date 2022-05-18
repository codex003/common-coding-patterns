package io.dev.codex;

import java.util.Stack;

// Reference online problems
// Leetcode: 1614. Maximum Nesting Depth of the Parentheses
// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
public class NestingDepthParenthesesProblem {
    // Using Stack
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                maxDepth = Math.max(maxDepth, stack.size());
            } else if(s.charAt(i) == ')') {
                stack.pop();
            }
        }
        return maxDepth;
    }

    // Without Stack
    public int maxDepthNoStack(String s) {
        int count = 0;
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
                maxDepth = Math.max(maxDepth, count);
            } else if(s.charAt(i) == ')') {
                count--;
            }
        }
        return maxDepth;
    }
}
