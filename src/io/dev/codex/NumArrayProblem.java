package io.dev.codex;

// Reference online problems
// Leetcode: 303. Range Sum Query - Immutable
// https://leetcode.com/problems/range-sum-query-immutable/
public class NumArrayProblem {
    private int[] sum;

    public NumArrayProblem(int[] nums) {
        sum = new int[nums.length];
        int result= 0;
        for(int i = 0;i < nums.length; i++) {
            result = result + nums[i];
            sum[i] = result;
        }
    }

    public int sumRange(int left, int right) {
        return left == 0 ? sum[right] : sum[right] - sum[left-1];
    }
}
