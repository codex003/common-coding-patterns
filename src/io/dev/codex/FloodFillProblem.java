package io.dev.codex;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

// Reference online problems
// Leetcode: 733. Flood Fill
// https://leetcode.com/problems/flood-fill/
public class FloodFillProblem {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[] p = {sr, sc};
        int origColor = image[sr][sc];
        Queue<int[]> taskQueue = new LinkedList<>();
        taskQueue.add(p);

        while (!taskQueue.isEmpty()) {
            int[] cur = taskQueue.poll();
            int x = cur[0];
            int y = cur[1];

            if(image[x][y] == origColor) {
                image[x][y] = newColor;
            }

            if(isValid(image,x,y+1,origColor, newColor)) {
                image[x][y + 1] = newColor;
                taskQueue.add(new int[]{x, y + 1});
            }

            if(isValid(image,x,y-1,origColor, newColor)) {
                image[x][y - 1] = newColor;
                taskQueue.add(new int[]{x, y - 1});
            }

            if(isValid(image,x + 1,y,origColor, newColor)) {
                image[x + 1][y] = newColor;
                taskQueue.add(new int[]{x + 1, y});
            }

            if(isValid(image,x - 1,y,origColor, newColor)) {
                image[x - 1][y] = newColor;
                taskQueue.add(new int[]{x - 1, y});
            }
        }
        return image;
    }

    private boolean isValid(int[][] image, int x, int y, int sourceColor, int newColor) {
        return (x >=0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == sourceColor && image[x][y] != newColor);
    }
}
