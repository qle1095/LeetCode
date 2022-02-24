package leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

    @Test
    public void test() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {2, 2, 3};
//        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers2(nums2));
        //output: 5,6
    }


    private List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];


        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = true;
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    List<Integer> findDisappearedNumbers2(int[] a) {
        int idx;
        for (int i = 0; i < a.length; i++) {
            idx = Math.abs(a[i]) - 1;
            if (a[idx] > 0)
                a[idx] *= -1;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++)
            if (a[i] > 0)
                result.add(i + 1);
        return result;
    }
}
