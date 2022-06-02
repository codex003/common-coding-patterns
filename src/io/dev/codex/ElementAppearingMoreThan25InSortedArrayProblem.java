package io.dev.codex;

// Reference online problems
// Leetcode: 1287. Element Appearing More Than 25% In Sorted Array
// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
public class ElementAppearingMoreThan25InSortedArrayProblem {
    public int findSpecialInteger(int[] arr) {
        int result = 0;
        int count = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if(i+count < arr.length && arr[i] == arr[i+count]) {
                result = arr[i];
                break;
            }
        }
        return result;
    }
}
