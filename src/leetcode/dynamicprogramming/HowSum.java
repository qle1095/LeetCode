package leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    /*
    return any combination the array have to meet the target sum, if it doesnt have any, then return null
    howSum(8, [2,3,5])-> [3,5]
                     8
             -2     -3        -5
            6        5         3
        -2 -3 -5  -2 -3 -5  -2 -3 -5
      4     3  1   3  2  0     0
  -2 -3 -5 -3     -3 -2
   2        0      0  0
   -2
   0

  [2,2,2,2]
  [2,3,3]
  [3,2,3]
  [3,3,2]
  [3,5]
  [5,3]

     */

    List<Integer> result = new ArrayList<>();

    @Test
    public void test() {
        System.out.println(howSum(300, new int[]{7, 14}));
        System.out.println(howSum(300, new int[]{7, 14}, new HashMap<>()));
    }


    /*
    m = target sum
    n = numbers.length

    time: O(n^m^2)
    space: O(m)
     */
    private List<Integer> howSum(int targetNum, int[] nums) {
        if (targetNum == 0) return new ArrayList<>();
        if (targetNum < 0) return null;

        for (int num : nums) {
            List<Integer> remainderResult = howSum(targetNum - num, nums);
            if (remainderResult != null) {
                ArrayList<Integer> finalResult = new ArrayList<>(remainderResult);
                finalResult.add(num);
                return finalResult;
            }
        }

        return null;
    }

    private List<Integer> howSum(int targetNum, int[] nums, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetNum)) {
            return memo.get(targetNum);
        }
        if (targetNum == 0) return new ArrayList<>();
        if (targetNum < 0) return null;

        for (int num : nums) {
            List<Integer> remainderResult = howSum(targetNum - num, nums, memo);
            if (remainderResult != null) {
                ArrayList<Integer> finalResult = new ArrayList<>(remainderResult);
                finalResult.add(num);
                memo.put(targetNum, finalResult);
                return finalResult;
            }
        }
        memo.put(targetNum, null);
        return null;
    }
}
