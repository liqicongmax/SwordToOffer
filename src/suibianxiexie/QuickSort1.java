package suibianxiexie;

import java.util.Arrays;

/**
 * @Author liqicong
 * @Date 2019/7/17 20:08
 * @Description
 */
public class QuickSort1 {
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
        return start;
    }
    public static void quicksort(int[] arr,int start,int end){
        if(start<end){
            int partition=partition(arr,start,end);
            quicksort(arr,start,partition-1);
            quicksort(arr,partition+1,end);
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,2,5,4};
        quicksort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
