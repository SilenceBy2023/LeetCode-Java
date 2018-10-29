package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    /**
     * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
     *
     * Example:
     *
     * Given array nums = [-1, 2, 1, -4], and target = 1.
     *
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     *
     * 思路：
     * 首先针对数组进行排序，先计算两个数值的和，然后再和target进行判断
     * @param nums: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        Arrays.sort(nums);
        int bestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - bestSum)) {
                    bestSum = sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return bestSum;
    }
}
