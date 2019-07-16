package 数组;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 15:44
 */
public class GetLeastNumbers {
    /**
     * 输入n个整数，找出其中最小的K个数。
     * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     * 排序肯定⑧行
     *
     * @param arr tds
     * @param k   tds
     * @return tds
     */
    public static ArrayList<Integer> getLeastNumbers(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < k) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (!list.contains(arr[i])) {
                    if (arr[i] <= min) {
                        min = arr[i];
                    }
                }
            }
            list.add(min);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        getLeastNumbers(arr, 4);
    }
}
