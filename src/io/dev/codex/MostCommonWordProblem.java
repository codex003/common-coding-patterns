package io.dev.codex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Reference online problems
// Leetcode: 819. Most Common Word
// https://leetcode.com/problems/most-common-word/
public class MostCommonWordProblem {
    private Map<String, Integer> freqMap = new HashMap<>();
    private Set<String> bannedWords = new HashSet<>();
    private int maxFreq = Integer.MIN_VALUE;
    private String result = "";

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();

        for(String s : banned) {
            bannedWords.add(s.toLowerCase());
        }

        int count = 0;
        StringBuilder nextWord = new StringBuilder("");
        while(count < paragraph.length()) {
            if(paragraph.charAt(count) >= 'a' && paragraph.charAt(count) <= 'z') {
                nextWord.append(paragraph.charAt(count));
            } else {
                String word = nextWord.toString();
                if(word.length() > 0) {
                    processWords(word);
                }
                nextWord = new StringBuilder("");
            }
            count++;
        }
        if(!nextWord.toString().equals("")) {
            processWords(nextWord.toString());
        }

        return result;
    }

    private void processWords(String word) {
        if(!bannedWords.contains(word)) {
            int newFreq = freqMap.getOrDefault(word, 0) + 1;
            freqMap.put(word, newFreq);
            if(newFreq > maxFreq) {
                maxFreq = newFreq;
                result = word;
            }
        }
    }
}
