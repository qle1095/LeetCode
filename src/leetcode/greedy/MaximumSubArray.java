package leetcode.greedy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumSubArray {

    /*
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    A subarray is a contiguous part of an array.
     */
    @Test
    public void test() {

//        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
//        System.out.println(maxSubArray(new int[]{4, -5, 3, 7, 8}));
//        System.out.println(maxSubArray(new int[]{1, 3, -5, 2, 5}));
        System.out.println(maxSubArray(new int[]{1, 3, -5, 2, 1}));
//        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        System.out.println(maxSubArray(new int[]{-15, -14, -20, -17, -18}));
//        System.out.println(maxSubArray(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }

    private int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < nums[i]) {
                currentSum = nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

}
