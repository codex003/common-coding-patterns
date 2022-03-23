package io.dev.codex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        ShortestWordDistanceProblem.shortestDistance(wordsDict, word1, word2);

    }
}
