package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
        Given array nums = [-1, 0, 1, 2, -1, -4],

        A solution set is:
        [
          [-1, 0, 1],
          [-1, -1, 2]
        ]
         * 算法思路：
         * 首先将该数组进行排序，取出第0位置的数，若该位置的数大于0那么直接返回，因为都是正数那么不可能相加为零
         * 若不为0，则依次进行遍历，取出负数部分进行判断
         */
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = 0 - nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end) {
                if (nums[start] + nums[end] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(0-target);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    res.add(list);
                    while (start < end && nums[start + 1] == nums[start]) {
                        start++;
                    }
                    start++;
                    while (start < end && nums[end - 1] == nums[end]) {
                        end--;
                    }
                    end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}
