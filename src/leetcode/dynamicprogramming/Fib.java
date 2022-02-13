package leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Fib {


    //example: fib(5)

//                5
//             4       3
//            3  2    2 1
//           2 1
// n = height = 4
    @Test
    public void test() {
        System.out.println(fib(20, new HashMap<>()));
    }


    //time: O(2^n) space:O(n)
    private int fib(int num) {
        if (num <= 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }
    //time: O(n) space: O(n)
    //with memoization
    private int fib(int num, Map<Integer, Integer> memo) {
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        if (num <= 2) {
            return 1;
        }
        int result = fib(num - 1, memo) + fib(num - 2, memo);
        memo.put(num, result);
        return result;
    }
}