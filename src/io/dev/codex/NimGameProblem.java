package io.dev.codex;

// Reference online problems
// Leetcode: 292. Nim Game
// https://leetcode.com/problems/nim-game/

public class NimGameProblem {
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
