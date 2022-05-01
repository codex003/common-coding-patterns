package io.dev.codex;

import java.util.ArrayList;
import java.util.List;

// Reference online problems
// Leetcode: 228. https://leetcode.com/problems/summary-ranges/
// https://leetcode.com/problems/summary-ranges/
public class SummaryRangesProblem {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int startRange = 0;
        int endRange;

        boolean flag = true;

        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                startRange = nums[i];
            }
            if(i+1 < nums.length && nums[i+1] == nums[i] + 1) {
                flag = false;
            } else {
                endRange = nums[i];
                if(startRange == endRange) {
                    list.add(String.valueOf(startRange));
                } else {
                    list.add(startRange + "->" + endRange);
                }
                flag = true;
            }
        }
        return list;
    }
}
