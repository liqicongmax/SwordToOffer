package 常见排序算法;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/9 10:00
 */
public class HeapSort {
    /**
     * 堆排序分为大顶堆和小顶堆
     */
    /**
     * 大顶堆的节点调整
     *
     * @param arr
     * @param parentIndex
     * @param length
     */
    public static void maxAdjust(int[] arr, int parentIndex, int length) {
        int temp = arr[parentIndex];//暂存当前节点的值
        int childrenIndex = parentIndex * 2 + 1;//左子节点
        while (childrenIndex < length) {
            //如果有右子节点并且右子节点大于左子节点,使用右子节点
            if (childrenIndex + 1 < length && arr[childrenIndex + 1] > arr[childrenIndex]) {
                childrenIndex++;
            }
            //如果父节点的值大于所有子节点,就不用调整了
            if (temp >= arr[childrenIndex]) {
                break;
            }
            arr[parentIndex] = arr[childrenIndex];//子节点的值赋给父节点
            parentIndex = childrenIndex;//修改父节点的值,以实现最后两个节点互换的效果
            childrenIndex = childrenIndex * 2 + 1;//跳转到下一个左子节点
        }
        arr[parentIndex] = temp;
    }

    private static void maxHeapSort(int[] arr) {
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            maxAdjust(arr, i, arr.length);//从下往上遍历所有的父节点,调整每个小二叉树的父节点
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            maxAdjust(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void minAdjust(int[] arr,int parentIndex,int length){
        int temp=arr[parentIndex];
        int childrenIndex=parentIndex*2+1;
        while(childrenIndex<length){
            if(childrenIndex+1<length&&arr[childrenIndex+1]<=arr[childrenIndex]){
                childrenIndex++;
            }
            if(temp<=arr[childrenIndex]){
                break;
            }
            arr[parentIndex]=arr[childrenIndex];
            parentIndex=childrenIndex;
            childrenIndex=childrenIndex*2+1;
        }
        arr[parentIndex]=temp;
    }
    public static void minHeapSort(int[] arr){
        for(int i=(arr.length-1)/2;i>=0;i--){
            minAdjust(arr,i,arr.length);
        }
        //倒着开始调整,跟第0个的父节点替换
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            minAdjust(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {122, 87, 78, 45, 17, 65, 53, 9, 32};
        maxHeapSort(arr);
        minHeapSort(arr);
    }


}
