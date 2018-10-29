package leetcode;

import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(nums, target);

        System.out.println(ints.toString());
    }
}