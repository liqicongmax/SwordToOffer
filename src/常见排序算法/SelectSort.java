package 常见排序算法;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 15:55
 */
public class SelectSort {
    /**
     * 选择排序
     * 每次选出一个最小的放到第一个,然后继续对后面的进行排序,是一种不稳定的排序算法
     * @param arr
     */
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                minIndex=arr[minIndex]<arr[j]?minIndex:j;
            }
            swap(arr,minIndex,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] nums, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void main(String[] args){
        int[] arr={3,2,1,5,6};
        selectSort(arr);
    }
}
