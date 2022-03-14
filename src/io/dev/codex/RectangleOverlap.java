package io.dev.codex;

// Reference online problems
// Leetcode: 836. Rectangle Overlap
// https://leetcode.com/problems/rectangle-overlap/

public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean isLeftRect = rec2[2] <= rec1[0];
        boolean isRightRect = rec2[0] >= rec1[2];
        boolean isUpperRect = rec2[1] >= rec1[3];
        boolean isLowerRect = rec2[3] <= rec1[1];

        return !isLeftRect && !isRightRect && !isUpperRect && !isLowerRect;
    }
}
