package io.dev.codex;

// Reference online problems
// Leetcode: 2119. A Number After a Double Reversal
// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class DoubleReversalProblem {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) {
            return true;
        }
        return num % 10 != 0;
    }
}
