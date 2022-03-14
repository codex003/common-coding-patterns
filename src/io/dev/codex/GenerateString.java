package io.dev.codex;

// Reference online problems
// Leetcode: 1374. Generate a String With Characters That Have Odd Counts
// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/

public class GenerateString {
    public String generateTheString(int n) {
        StringBuilder str = new StringBuilder();
        if(n % 2 != 0) {
            int count = 0;
            while(count < n) {
                str.append("a");
                count++;
            }
        } else {
            int count = 0;
            while(count < n-1) {
                str.append("a");
                count++;
            }
            str.append("b");
        }
        return str.toString();
    }
}
