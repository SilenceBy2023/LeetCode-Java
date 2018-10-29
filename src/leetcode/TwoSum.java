package leetcode;


import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //方法一
//        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
//        int[] res = new int[2];
//
//        for (int i = 0; i < nums.length; ++i) {
//            m.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; ++i) {
//            int t = target - nums[i];
//            if (m.containsKey(t) && m.get(t) != i) {
//                res[0] = i;
//                res[1] = m.get(t);
//                break;
//            }
//        }
//        return res;

        //方法二
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = nums.length-1; i >= 0; i--) {
            if(map.get(target - nums[i]) != null) {
                result[0] = i;
                result[i] = map.get(target-nums[i]);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
