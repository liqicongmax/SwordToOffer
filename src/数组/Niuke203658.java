package 数组;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/8 8:30
 */
public class Niuke203658 {
    /**
     * 在一个无序数组中找到3个数字组成数最小，要求这三个数字的索引是按序排列，例如23156这个数组，得到的结果是156
     * @param arr
     */
    public static void solution(int[] arr){
        int a1=findMin(arr,0,arr.length-3);
        int a2=findMin(arr,a1+1,arr.length-2);
        int a3=findMin(arr,a2+1,arr.length-1);
        System.out.println(arr[a1]*100+arr[a2]*10+arr[a3]);
    }

    /**
     * 从数组里找到最小的那个值的索引
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private static int findMin(int[] arr,int start,int end){
        if(start>end){
            return 0;
        }
        if(start==end){
            return start;
        }
        int minIndex=start;
        for(int i=start;i<=end;i++){
            if(arr[i]<arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args){
        int[] arr={2,3,1,5,6,2,8};
        solution(arr);
    }
}
