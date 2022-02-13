package leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    /*
    write a function canSum(targetSum, nums[])
    function should return a boolean indicating weither or not it is possible to generate the targetSum using numbers from the array
    u can use an element of array multiple times
    all input are nonnegative
    canSum(7,[5,3,4,7]) -> true
    canSum(7,[2,4]) -> false

                           7
                  -5   -3      -4   -7
                  2     4       3     0
                       -4       -3
                        0       0

            0 = base case
     */

    @Test
    public void test() {
        System.out.println(canSum(300, new int[]{7,14}));
        System.out.println(canSum(300, new int[]{7,14},new HashMap<>()));
    }

    /*
    m = targetsum
    n = array length
    Time: O(n^m)
    Space O(m)
     */
    private boolean canSum(int targetSum, int[] nums) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int num : nums) {
            if (canSum(targetSum - num, nums)) {
                return true;
            }
        }
        return false;
    }
    /*
    Time: O(n*m)
    Space: O(m)
     */
    private boolean canSum(int targetSum, int[] nums, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int num : nums) {
            if (canSum(targetSum - num, nums,memo)) {
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);

        return false;
    }
}
