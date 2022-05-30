package io.dev.codex;

// Reference online problems
// Leetcode: 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindromeProblem {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while(startIndex < endIndex) {
            if(!isAlphanumeric(s,startIndex)) {
                startIndex++;
            } else if(!isAlphanumeric(s,endIndex)) {
                endIndex--;
            } else {
                if(s.charAt(startIndex) != s.charAt(endIndex)) {
                    return false;
                }
                startIndex++;
                endIndex--;
            }
        }
        return true;
    }
    private boolean isAlphanumeric(String input, int index) {
        return ((input.charAt(index) >= 'a' && input.charAt(index) <= 'z') ||
                (input.charAt(index) >= '0' && input.charAt(index) <= '9'));
    }
}
