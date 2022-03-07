package io.dev.codex;

import java.util.HashMap;
import java.util.Stack;

// Reference online problems
// Leetcode: 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        HashMap<Character, Character> matchingPairs = new HashMap<>();

        matchingPairs.put('(',')');
        matchingPairs.put('{','}');
        matchingPairs.put('[',']');

        for(int i = 0; i < s.length(); i++) {
            Character nextChar = s.charAt(i);
            if(matchingPairs.containsKey(nextChar)) {
                myStack.push(nextChar);
            } else {
                if(myStack.isEmpty()) {
                    return false;
                }

                if(nextChar.equals(matchingPairs.get(myStack.peek()))) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
