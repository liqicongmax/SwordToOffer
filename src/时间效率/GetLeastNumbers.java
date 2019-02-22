package 时间效率;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class GetLeastNumbers {
    public ArrayList<Integer> solution(int[] input, int k) {
        return null;
    }
    public int partition(int[] arr,int start,int end){
        int temp;
        int key=arr[start];
        while(start<end){
            while(start<end&&arr[end]>=key){
                end--;
            }
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            while(start<end&&arr[end]<=key){
                start++;
            }
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        arr[start]=key;
        return start;
    }
    public static void main(String[] args){

    }
}
