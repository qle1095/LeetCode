package leetcode.array;

import org.junit.jupiter.api.Test;

public class RangeSumQuery {

    @Test
    public void test() {
        System.out.println(new NumArray(new int[]{1, 2, 4, 6, 2, -1}).sumRange(1, 3));
    }

    class NumArray {
        private final int[] preSum;

        public NumArray(int[] nums) {
            preSum = new int[nums.length + 1];
            //caching result into preSum list
            for (int i = 1; i < preSum.length; i++) {
                preSum[i] = preSum[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            //use this formula to get sum for a range
            return preSum[right + 1] - preSum[left];
        }
    }
}
