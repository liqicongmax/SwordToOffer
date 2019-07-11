package test;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/10 17:06
 */
public class HeapSort {
    public static void maxAdjust(int[] arr,int parentIndex,int length){
        int temp=arr[parentIndex];
        int childrenIndex=parentIndex*2+1;
        while (childrenIndex<length){
            if(childrenIndex+1<length&&arr[childrenIndex+1]>arr[childrenIndex]){
                ++childrenIndex;
            }
            if(temp>=arr[childrenIndex]){
                break;
            }
            arr[parentIndex]=arr[childrenIndex];
            parentIndex=childrenIndex;
            childrenIndex=childrenIndex*2+1;
        }
        arr[parentIndex]=temp;
    }
    
    public static void maxHeapSort(int[] arr){
        //生成堆,只要取一半就可以,因为调整过程中会有*2+1的操作
        for(int i=(arr.length-2)/2;i>=0;i--){
            maxAdjust(arr,i,arr.length);
        }
        System.out.println(Arrays.toString(arr));
        //把第一个元素放到最后,然后每次缩短数组长度,调整
        for(int i=arr.length-1;i>=0;i--){
            //大的放到最后,不需要进行堆调整了
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            maxAdjust(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {22, 31,  45, 17, 65,78, 53, 9, 32};
        maxHeapSort(arr);
    }
}
