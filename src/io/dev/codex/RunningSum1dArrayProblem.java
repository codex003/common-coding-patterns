package io.dev.codex;

// Reference online problems
// Leetcode: 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum1dArrayProblem {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
