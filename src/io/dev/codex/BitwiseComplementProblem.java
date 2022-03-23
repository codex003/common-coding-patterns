package io.dev.codex;

// Reference online problems
// Leetcode: 1009. Complement of Base 10 Integer
// https://leetcode.com/problems/complement-of-base-10-integer/
public class BitwiseComplementProblem {
    public int bitwiseComplement(int n) {
        int result = 0;
        int rem = 0;
        int counter = 0;

        if(n == 0) return 1;

        while(n > 0) {
            rem = n % 2;
            rem = (rem == 0) ? 1 : 0;
            result = result + (int)(Math.pow(2,counter))*rem;
            n = n / 2;
            counter++;
        }
        return result;
    }
}
