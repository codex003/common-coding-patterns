package io.dev.codex;

// Reference online problems
// Leetcode: 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPositionProblem {
    public int searchInsert(int[] nums, int target) {
        return findTarget(nums, target, 0, nums.length - 1);
    }

    private int findTarget(int[] nums, int target, int start, int end) {
        if(start > end) {
            return start;
        }

        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return findTarget(nums, target, mid + 1, end);
        } else {
            return findTarget(nums, target, start, mid -1);
        }

    }
}
