package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int res = threeSumClosest.threeSumClosest(nums, target);

        System.out.println(res);
    }
}