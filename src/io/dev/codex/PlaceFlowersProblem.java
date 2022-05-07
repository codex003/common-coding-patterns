package io.dev.codex;

// Reference online problems
// Leetcode: 605. Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/
public class PlaceFlowersProblem {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean isLeftPlanted = i >= 1 && flowerbed[i - 1] == 1;
                boolean isRightPlanted = i <= flowerbed.length - 2 && flowerbed[i + 1] == 1;
                if(isLeftPlanted || isRightPlanted) {
                } else {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}
