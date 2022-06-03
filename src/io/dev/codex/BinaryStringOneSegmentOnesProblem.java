package io.dev.codex;

// Reference online problems
// Leetcode: 1784. Check if Binary String Has at Most One Segment of Ones
// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class BinaryStringOneSegmentOnesProblem {
    public boolean checkOnesSegment(String s) {
        int i = 0;
        while(i < s.length() && s.charAt(i) == '1') {
            i++;
        }
        for (int j = i; j < s.length(); j++) {
            if(s.charAt(j) == '1') {
                return false;
            }
        }
        return true;
    }
}
