package algorithms.search;

import java.util.Arrays;

/**
 * 二分查找法主要是针对已经排序的数组查找给定的key在数组中的位置，若未查找到那么就返回-1
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        //数组需要是有序的
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            //需要查找的key要么不存在，要么就在a[start...end]之中
            int mid = start + (end - start) / 2;
            if (key < a[mid]) end = mid;
            else if (key > a[mid]) start = mid;
            else return mid;
        }
        return -1;
    }

    //测试
    public static void main(String[] args) {
        int[] whitelist = {25, 27, 30, 11, 8, 23, 123, 257};
        Arrays.sort(whitelist);
        int key = 23;
        System.out.println(rank(key, whitelist));
    }
}
