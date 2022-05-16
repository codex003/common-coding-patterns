package io.dev.codex;

import java.util.HashMap;
import java.util.Map;

// Reference online problems
// Leetcode: 1137. N-th Tribonacci Number
// https://leetcode.com/problems/n-th-tribonacci-number/
public class TribonacciNumberProblem {
    public int tribonacci(int n) {
        if (n < 3) {
            return n == 0 ? 0 : 1;
        }
        Map<Integer, Integer> tribonacciMap = new HashMap<>();
        tribonacciMap.put(0, 0);
        tribonacciMap.put(1, 1);
        tribonacciMap.put(2, 1);
        for (int i = 3; i <= n; i++) {
            int result = tribonacciMap.get(i - 3) + tribonacciMap.get(i - 2) + tribonacciMap.get(i - 1);
            tribonacciMap.put(i, result);
        }
        return tribonacciMap.get(n);
    }
}
