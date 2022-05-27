package io.dev.codex;

// Reference online problems
// Leetcode: 1790. Check if One String Swap Can Make Strings Equal
// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
public class StringEqualByStringSwapProblem {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1;
        int second = -1;

        if(s1.equals(s2)) return true;

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(first == -1) {
                    first = i;
                } else if(second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return second != -1 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }
}
