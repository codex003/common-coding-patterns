package io.dev.codex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "salesmen";
        String s2 = "nameless";

        System.out.println(Anagrams.areAnagramsBF(s1,s2));
        System.out.println(Anagrams.areAnagramsByHashmap(s1,s2));
        System.out.println(Anagrams.areAnagramsBySorting(s1,s2));

    }
}
