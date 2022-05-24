package io.dev.codex;

// Reference online problems
// Leetcode: 1678. Goal Parser Interpretation
// https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretationProblem {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i < command.length()) {
            if(command.charAt(i) == 'G') {
                result.append(command.charAt(i));
                i++;
            } else if(i + 1 <= command.length() && command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                result.append("o");
                i = i+2;
            } else if(i + 3 <= command.length() && command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
                result.append("al");
                i = i+4;
            } else {
                i = i+1;
            }
        }
        return result.toString();
    }
}
