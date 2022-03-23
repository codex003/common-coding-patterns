package io.dev.codex;

import java.util.ArrayList;
import java.util.List;

// Reference online problems
// Leetcode: 243. Shortest Word Distance
// https://leetcode.com/problems/shortest-word-distance/

public class ShortestWordDistanceProblem {
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        List<Integer> word1Indexes = new ArrayList<>();
        List<Integer> word2Indexes = new ArrayList<>();

        for(int i = 0; i < wordsDict.length; i++) {
            if(wordsDict[i].equals(word1)) {
                word1Indexes.add(i);
            } else if(wordsDict[i].equals(word2)) {
                word2Indexes.add(i);
            }
        }
        int shortestPath = Integer.MAX_VALUE;

        for (int i = 0; i < word1Indexes.size(); i++) {
            for (int j = 0; j < word2Indexes.size(); j++) {
                int distance = Math.abs(word1Indexes.get(i)-word2Indexes.get(j));
                if(distance < shortestPath) {
                    shortestPath = distance;
                }
            }
        }
        return shortestPath;
    }
}
