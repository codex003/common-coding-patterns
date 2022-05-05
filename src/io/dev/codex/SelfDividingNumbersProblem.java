package io.dev.codex;

import java.util.ArrayList;
import java.util.List;

// Reference online problems
// Leetcode: 728. Self Dividing Numbers
// https://leetcode.com/problems/self-dividing-numbers/
public class SelfDividingNumbersProblem {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        int temp = left;
        while(temp <= right) {
            if(isSelfDividingNumber(temp)) {
                result.add(temp);
            }
            temp++;
        }
        return result;
    }

    private boolean isSelfDividingNumber(int num) {
        int temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            if(digit == 0) {
                return false;
            }
            if(num % digit != 0) {
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}
