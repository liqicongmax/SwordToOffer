package test;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/10 17:06
 */
public class HeapSort {
    /**
     * 大顶堆的建立,堆排序复杂度为N(nlogn)
     * @param arr
     * @param parentIndex
     * @param length
     */
    public static void maxAdjust(int[] arr,int parentIndex,int length){
        int temp=arr[parentIndex];
        int childrenIndex=parentIndex*2+1;
        while(childrenIndex<length){
            if(childrenIndex+1<length&&arr[childrenIndex]<arr[childrenIndex+1]){
                childrenIndex++;
            }
            if(temp>arr[childrenIndex]){
                break;
            }
            arr[parentIndex]=arr[childrenIndex];
            parentIndex=childrenIndex;
            childrenIndex=childrenIndex*2+1;
        }
        arr[parentIndex]=temp;
    }

    /**
     * 对大顶堆进行排序
     * @param arr
     */
    public static void maxHeapSort(int[] arr){
        for(int i=(arr.length-2)/2;i>=0;i--){
            maxAdjust(arr,i,arr.length);
        }
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxAdjust(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {22, 31,  45, 17, 65,78, 53};
        maxHeapSort(arr);
    }
}
