package io.dev.codex;

import java.util.ArrayList;
import java.util.List;

// Reference online problems
// Leetcode: 1403. Minimum Subsequence in Non-Increasing Order
// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class MinimumSubsequenceProblem {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> subIndexes = new ArrayList<>();

        int total = calculateTotal(nums);

        boolean runCalc = true;

        while(runCalc) {
            int maxIndex = maxNumIndex(nums, subIndexes);
            subIndexes.add(maxIndex);

            int subIndexTotal = 0;
            for (Integer subIndex : subIndexes) {
                subIndexTotal = subIndexTotal + nums[subIndex];
            }

            if(subIndexTotal > (total - subIndexTotal)) {
                runCalc = false;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (Integer subIndex : subIndexes) {
            answer.add(nums[subIndex]);
        }
        return answer;
    }

    private int maxNumIndex(int[] nums, List<Integer> subIndexes) {
        int maxIndex = 0;
        int count = 0;
        boolean findSeedIndex = true;
        while(findSeedIndex) {
            if(subIndexes.contains(count)) {
                count++;
            } else {
                findSeedIndex = false;
            }
        }
        maxIndex = count;
        for (int i = 0; i < nums.length; i++) {
            if(!subIndexes.contains(i)) {
                if(nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

    private int calculateTotal(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        return total;
    }
}
