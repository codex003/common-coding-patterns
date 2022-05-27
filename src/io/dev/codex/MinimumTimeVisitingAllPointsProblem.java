package io.dev.codex;

// Reference online problems
// Leetcode: 1266. Minimum Time Visiting All Points
// https://leetcode.com/problems/minimum-time-visiting-all-points/
public class MinimumTimeVisitingAllPointsProblem {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;

        for (int i = 0; i < points.length - 1; i++) {
            result = result + Math.max(Math.abs(points[i+1][0]-points[i][0]),Math.abs(points[i+1][1]-points[i][1]));
        }

        return result;
    }
}
