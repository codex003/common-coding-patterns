package io.dev.codex;

// Reference online problems
// Leetcode: 263. Ugly Number
// https://leetcode.com/problems/ugly-number/
public class UglyNumberProblem {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        boolean flag = true;

        while(flag) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else if (n % 3 == 0) {
                n = n / 3;
            }
            else if (n % 5 == 0) {
                n = n / 5;
            }
            else {
                flag = false;
            }
        }

        return n == 1;
    }
}
