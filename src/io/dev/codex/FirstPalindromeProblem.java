package io.dev.codex;

// Reference online problems
// Leetcode: 2108. Find First Palindromic String in the Array
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class FirstPalindromeProblem {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }
    private boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;

        while(j >= i) {
            if(input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
