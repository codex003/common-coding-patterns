package io.dev.codex;

// Reference online problems
// Leetcode: 58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public int calcLengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;
        int counter = 0;
        while(i >= 0 && s.charAt(i) != ' ') {
            counter++;
            i = i - 1;
        }
        return counter;
    }
}
