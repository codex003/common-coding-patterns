package io.dev.san;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// Reference online problems
// Leetcode: 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/

public class Anagrams {
    // Brute Force
    public static boolean areAnagramsBF(String s1, String s2) {
        HashSet<Integer> visited = new HashSet<>();
        boolean found = false;
        if(s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            found = false;
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j) && !(visited.contains(j))) {
                    visited.add(j);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not Found ["+s1.charAt(i)+"]");
                return false;
            }
        }
        return true;
    }

    // Save the frequency in Hashmap
    public static boolean areAnagramsByHashmap(String s1, String s2) {
        boolean result = false;
        HashMap<Character, Integer> firstStringMap = new HashMap<>();
        HashMap<Character, Integer> secondStringMap = new HashMap<>();

        if(s1.length() != s2.length()) return result;

        populateFrequency(s1, firstStringMap);
        populateFrequency(s2, secondStringMap);

        for (int i = 0; i < s1.length(); i++) {
            if(!firstStringMap.get(s1.charAt(i)).equals(secondStringMap.get(s1.charAt(i)))) {
                System.out.println("Char:"+s1.charAt(i)+": FirstMapOccurrence:"+firstStringMap.get(s1.charAt(i))+": SecondStringMap:"+secondStringMap.get(s1.charAt(i)));
                return false;
            }
        }

        return true;
    }

    private static void populateFrequency(String s, HashMap<Character, Integer> charFreqMap) {
        for (int i = 0; i < s.length(); i++) {
            Integer count = 0;
            if(charFreqMap.containsKey(s.charAt(i))) {
                count = charFreqMap.get(s.charAt(i));
            }
            count++;
            charFreqMap.put(s.charAt(i),count);
        }
    }

    // Sort and compare
    public static boolean areAnagramsBySorting(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] firstCharArray = s1.toCharArray();
        char[] secondCharArray = s2.toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        System.out.println("firstSortedString = " + String.valueOf(firstCharArray));
        System.out.println("secondSortedString = " + String.valueOf(secondCharArray));

        if(String.valueOf(firstCharArray).equals(String.valueOf(secondCharArray))) return true;

        return false;
    }
}