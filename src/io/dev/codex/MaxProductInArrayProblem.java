package io.dev.codex;

// Reference online problems
// Leetcode: 1464. Maximum Product of Two Elements in an Array
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

public class MaxProductInArrayProblem {
    public int maxProduct(int[] nums) {
        int m = 0; // tracks maximum number
        int n = 0; // tracks second maximum number

        // Initialize m & n with array
        if(nums[0] > nums[1]) {
            m = nums[0];
            n = nums[1];
        } else {
            m = nums[1];
            n = nums[0];
        }

        for(int i = 2; i < nums.length; i++) {
            if(nums[i] > m) {
                // Found higher maximum number
                n = m;
                m = nums[i];
            } else if(nums[i] > n && nums[i] <= m) {
                  // Found higher second maximum number
                n = nums[i];
            }
        }
        return (m-1) * (n-1);
    }
}
