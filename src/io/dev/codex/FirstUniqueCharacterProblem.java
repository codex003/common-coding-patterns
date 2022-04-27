package io.dev.codex;

import java.util.HashMap;

// Reference online problems
// Leetcode: 387. First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterProblem {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> cache = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (cache.get(s.charAt(i)) != null) {
                cache.put(s.charAt(i), cache.get(s.charAt(i)) + 1);
            } else {
                cache.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (cache.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
