package io.dev.codex;

// Reference online problems
// Leetcode: 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArrayProblem {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = n;
        for (int k = 0; k < nums.length; k++) {
            if(k % 2 == 0) {
                result[k] = nums[i];
                i++;
            } else {
                result[k] = nums[j];
                j++;
            }
        }
        return result;
    }
}
