package OverMedium;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/30 8:42
 */
public class QuickSort {
    public static int partition(int[] arr, int start, int end) {
        int temp = arr[start];
//        while(start<end){
        while (start < end && arr[end] > temp) {
            end--;
        }
        arr[start] = arr[end];
        while (start < end && arr[start] < temp) {
            start++;
        }
        arr[end] = arr[start];
//        }
        arr[start] = temp;
        return start;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
