package io.dev.codex;

// Reference online problems
// Leetcode: 1592. Rearrange Spaces Between Words
// https://leetcode.com/problems/rearrange-spaces-between-words/

import java.util.HashMap;
import java.util.Map;

public class ReArrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        int totalWords = 0;
        Map<Integer, String> wordMap = new HashMap<>();
        int i = 0;
        StringBuilder UpdatedStr = new StringBuilder("");

        while(i < text.length()) {
            if(text.charAt(i) == ' ') {
                totalSpaces++;
                i++;
            } else {
                String tmp = extractNextWord(text.substring(i));
                totalWords++;
                wordMap.put(totalWords,tmp);
                i = i + tmp.length();
            }
        }

        int equalSpaces = totalWords == 1 ? 0 : totalSpaces / (totalWords - 1);
        int trailingSpaces = totalWords == 1 ? totalSpaces : totalSpaces % (totalWords - 1);
        StringBuilder spacerStr = new StringBuilder("");
        StringBuilder trailingSpacesStr = new StringBuilder("");
        int k = 0;
        while(k < equalSpaces) {
            spacerStr.append(" ");
            k++;
        }

        k = 0;
        while(k < trailingSpaces) {
            trailingSpacesStr.append(" ");
            k++;
        }

        for (int j = 1; j <= totalWords; j++) {
            UpdatedStr.append(wordMap.get(j));
            if(j != totalWords) {
                UpdatedStr.append(spacerStr);
            }
        }
        UpdatedStr.append(trailingSpacesStr);
        return UpdatedStr.toString();
    }

    private String extractNextWord(String input) {
        StringBuilder tmp = new StringBuilder("");
        int i = 0;
        while(i < input.length() && input.charAt(i) != ' ') {
            tmp.append(input.charAt(i));
            i++;
        }
        return tmp.toString();
    }
}
