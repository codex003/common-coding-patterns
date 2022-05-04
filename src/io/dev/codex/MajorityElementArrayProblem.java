package io.dev.codex;

// Reference online problems
// Leetcode: 1150. Check If a Number Is Majority Element in a Sorted Array
// https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/
public class MajorityElementArrayProblem {
    public boolean isMajorityElement(int[] nums, int target) {

        int startIndex = Integer.MAX_VALUE;
        int endIndex = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(startIndex == Integer.MAX_VALUE) {
                    startIndex = i;
                    endIndex = i;
                } else {
                    endIndex = i;
                }
            }
        }
        if(startIndex == Integer.MAX_VALUE) return false;
        return (endIndex - startIndex + 1) > nums.length / 2;
    }
}
