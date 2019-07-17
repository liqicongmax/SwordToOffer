package 头条算法;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/17 9:31
 */
public class K个有序数组找中位数 {
    /**
     * 给你k个有序数组，然后找出中位数
     * (1,2,8)(1,3,4)(2,5,9)中位数是3
     * 目前假设每个数组长度都一样
     * 排序再找显然不合适
     * @param arr s
     * @return s
     */
    private static int findMid(int[][] arr){
        int[] arrr=combine(arr[0],arr[1]);
        System.out.println(Arrays.toString(arrr));
        return 0;
    }
    private static int[] combine(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        arr[0]=arr1[0]>arr2[0]?arr2[0]:arr1[0];
        int i=0;
        int j=0;
        int temp=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[temp]=arr1[i];
                i++;
            }else {
                arr[temp]=arr2[j];
                j++;
            }
            temp++;
        }
        if((i==arr1.length)&&(j!=arr2.length)){
            for(int a=j;a<arr2.length;a++){
                arr[temp++]=arr2[a];
            }
        }
        if((j==arr2.length)&&(i!=arr1.length)){
            for(int a=i;a<arr1.length;a++){
                arr[temp++]=arr1[a];
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[][] arr={{1,2,8},{1,3,4}};
        findMid(arr);
    }
}
