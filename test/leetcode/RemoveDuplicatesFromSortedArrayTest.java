package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        int[] nums = {1, 1, 1, 2};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int removeDuplicates = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(removeDuplicates);
    }
}