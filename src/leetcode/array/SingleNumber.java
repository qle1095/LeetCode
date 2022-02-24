package leetcode.array;

import org.junit.jupiter.api.Test;

public class SingleNumber {
    /*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
     */

    @Test
    public void test() {
        System.out.println(singleNumber(new int[]{1, 1, 2, 2, 3}));
    }

    private int singleNumber(int[] nums) {

        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNum ^= nums[i];
        }

        return singleNum;
    }
}
