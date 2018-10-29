package leetcode;

import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        int[] array = {-2, 0, 0, 2, 2};

        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(array);

        System.out.println(lists.toString());
    }
}