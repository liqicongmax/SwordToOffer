package 数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 14:42
 */
public class MoreThanHalfNum {
    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     * O(nlogn)的解法
     *
     * @param arr s
     * @return s
     */
    public static int moreThanHalfNum(int[] arr) {
        Arrays.sort(arr);
        int num = arr[arr.length / 2];
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count > (arr.length / 2) ? num : 0;
    }

    /**
     * 时间复杂度O(n)
     * @param arr
     * @return
     */
    public static int findMoreThanHalfNum(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int man = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                man = arr[i];
                count = 1;
            } else {
                if (man == arr[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==man){
                count++;
            }
        }
        return count>(arr.length/2)?man:0;
    }
        public static void main (String[]args){
            int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
            System.out.println(findMoreThanHalfNum(arr));
        }
    }
