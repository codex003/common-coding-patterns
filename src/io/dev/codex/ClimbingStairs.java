package io.dev.codex;

// Reference online problems
// Leetcode: 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/

import java.util.HashMap;

public class ClimbingStairs {
    HashMap calcMap = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if (n == 1 || n == 2) return n;

        if(calcMap.containsKey(n))  {
            return (Integer)calcMap.get(n);
        } else {
            int steps = climbStairs(n - 1) + climbStairs(n - 2);
            calcMap.put(n, steps);
            return steps;
        }
    }
}
