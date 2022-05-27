package io.dev.codex;

// Reference online problems
// Leetcode: 344. Reverse String
// https://leetcode.com/problems/reverse-string/
public class ReverseStringProblem {
    public void reverseString(char[] s) {
        int firstIndex = 0;
        int secondIndex = s.length - 1;

        while(secondIndex > firstIndex) {
            char temp = s[firstIndex];
            s[firstIndex] = s[secondIndex];
            s[secondIndex] = temp;
            firstIndex++;
            secondIndex--;
        }
    }
}
