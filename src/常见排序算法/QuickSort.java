package 常见排序算法;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 14:59
 */
public class QuickSort {
    /**
     * 找到数组中第K个大的数
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] arr,int start,int end){
        int temp=arr[start];
        while(start<end){
            while(start<end&&arr[end]>temp){
                end--;
            }
            arr[start]=arr[end];
            while(start<end&&arr[start]<temp){
                start++;
            }
            arr[end]=arr[start];
        }
        arr[start]=temp;
        //System.out.println(Arrays.toString(arr));
        return start;
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int partition=partition(arr,start,end);
            quickSort(arr,start,partition-1);
            quickSort(arr,partition+1,end);
        }
    }
    public static void main(String[] args){
        int[] arr={2,7,1,6,5,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
