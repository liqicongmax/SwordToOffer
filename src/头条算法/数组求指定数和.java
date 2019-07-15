package 头条算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 8:28
 */
public class 数组求指定数和 {
    /**
     * 给定一个int数组A，数组中元素互不重复，给定一个数x，求所有求和能得到x的数字组合，组合中的元素来自A，可重复使用。
     *
     * @param arr 数组,元素不重复
     * @param target 求和值
     * @return
     */
    private static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    private static ArrayList<ArrayList<Integer>> sum(int[] arr, int target) {
        Arrays.sort(arr);
        if (arr.length == 0)
            return res;
        ArrayList<Integer> list = new ArrayList<>();
        bk(arr, target, 0, list);
        System.out.println(res.size());
        return res;
    }

    private static void bk(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (target == 0) {
            res.add(list);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
            bk(arr, target - arr[i], i, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        sum(arr, 7);
    }
}
