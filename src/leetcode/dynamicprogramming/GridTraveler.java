package leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {


    //input X and Y
    /*
        calculate how many possible outcomes for a grid x*y
           3,2
      2,2       3,1
    1,2 2,1     2,1
    1,1  1,1    1,1
     */
    @Test
    public void test() {
        System.out.println(gridTraveler(18, 18, new HashMap<>()));
        System.out.println(gridTraveler(18, 18));
    }


    //O(2^(n+m)) time o(n+m) space
    private int gridTraveler(int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }
        if (x == 1 || y == 1) {
            return 1;
        }
        return gridTraveler(x - 1, y) + gridTraveler(x, y - 1);
    }

    //with memoization
    //O(n*m) time o(n+m) space
    private int gridTraveler(int x, int y, Map<String, Integer> memo) {
        String key = x + "," + y;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (x < 0 || y < 0) {
            return 0;
        }
        if (x == 1 || y == 1) {
            return 1;
        }

        int result = gridTraveler(x - 1, y, memo) + gridTraveler(x, y - 1, memo);
        memo.put(key, result);
        return result;
    }
}
