package io.dev.codex;

import java.util.HashMap;
import java.util.Map;

// Reference online problems
// Leetcode: 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
public class FibonacciProblem {
    Map<Integer, Integer> fibMap = new HashMap<>();

    public int fib(int n) {
        if(n <= 1) {
            return n;
        }

        int result = 0;
        if(fibMap.containsKey(n)) {
            result = fibMap.get(n);
        } else {
            result = fib(n - 2) + fib(n - 1);
            fibMap.put(n, result);
        }
        return result;
    }
}
