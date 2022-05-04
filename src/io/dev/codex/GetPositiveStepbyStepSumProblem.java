package io.dev.codex;

// Reference online problems
// Leetcode: 1413. Minimum Value to Get Positive Step by Step Sum
// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
public class GetPositiveStepbyStepSumProblem {
    public int minStartValue(int[] nums) {
        boolean process = true;
        int minVal = 1;
        while(process) {
            int result = minVal;
            boolean issues = false;
            for (int i = 0; i < nums.length; i++) {
                result = result + nums[i];
                if(result < 1) {
                    issues = true;
                    break;
                }
            }
            if(!issues) {
                break;
            }
            minVal++;
        }
        return minVal;
    }
}
