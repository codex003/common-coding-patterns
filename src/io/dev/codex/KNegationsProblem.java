package io.dev.codex;

// Reference online problems
// Leetcode: 228. Maximize Sum Of Array After K Negations
// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class KNegationsProblem {
    public int largestSumAfterKNegations(int[] nums, int k) {
        while(k > 0) {
            int minIndex = getMinimumIndex(nums);
            nums[minIndex] = -nums[minIndex];
            k--;
        }
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    private int getMinimumIndex(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < nums[min]) {
                min = i;
            }
        }
        return min;
    }
}
