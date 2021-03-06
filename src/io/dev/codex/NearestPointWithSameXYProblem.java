package io.dev.codex;

// Reference online problems
// Leetcode: 1779. Find Nearest Point That Has the Same X or Y Coordinate
// https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
public class NearestPointWithSameXYProblem {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int manDistance = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < points.length; i++) {
            if((points[i][0] == x) || (points[i][1] == y)) {
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(distance < manDistance) {
                    manDistance = distance;
                    result = i;
                }
            }
        }
        return result;
    }
}
