package io.dev.codex;

import java.util.HashMap;
import java.util.Map;

// Reference online problems
// Leetcode: 914. X of a Kind in a Deck of Cards
// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
public class DeckOfCardsSameKindProblem {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int result = Integer.MAX_VALUE;

        for (int value : deck) {
            if (freqMap.containsKey(value)) {
                freqMap.put(value, freqMap.get(value) + 1);
            } else {
                freqMap.put(value, 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            if(result == Integer.MAX_VALUE) {
                result = entry.getValue();
            } else {
                result = calcGCD(entry.getValue(), result);
            }
        }
        return result >= 2;
    }

    private int calcGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcGCD(b, a % b);
    }
}
