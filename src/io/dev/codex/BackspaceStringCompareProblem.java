package io.dev.codex;

import java.io.CharConversionException;
import java.util.Stack;

// Reference online problems
// Leetcode: 844. Backspace String Compare
// https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompareProblem {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#') {
                sStack.push(s.charAt(i));
            } else if(!sStack.isEmpty()) {
                sStack.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '#') {
                tStack.push(t.charAt(i));
            } else if(!tStack.isEmpty()) {
                tStack.pop();
            }
        }

        return String.valueOf(sStack).equals(String.valueOf(tStack));
    }
}
