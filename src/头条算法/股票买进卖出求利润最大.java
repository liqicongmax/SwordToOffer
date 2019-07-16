package 头条算法;

import dynamicprogramming.LongestIncreasingPath;
import dynamicprogramming.MaxSequence;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 11:28
 */
public class 股票买进卖出求利润最大 {
    /**
     * 求股票的最大利润，例如[1, 3, 1, 8, 10, 3]，数组代表每天股票的价格,
     * 1.只能买卖一次，计算最大收益
     * 2.能买卖无数次，计算最大收益
     * 3.只能买卖两次，计算最大收益 解法:把得出的差值数组正数相加以负数为分割保存到新的数组,把两个最大的元素求和就行;
     *
     */
    public static int solution1(int[] arr){
        int[] arr1=deal(arr);
        return MaxSequence.maxSequence(arr1)<0?0:MaxSequence.maxSequence(arr1);
    }

    public static int solution2(int[] arr){
        int sum=0;
        int[] arr1=deal(arr);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                sum+=arr1[i];
            }
        }
        return sum;
    }
    public static int[] deal(int[] arr){
        if(arr.length==0||arr.length==1){
            return arr;
        }
        int[] arr1=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr1[i]=arr[i+1]-arr[i];
        }
        return arr1;
    }
    public static void main(String[] args){
        int[] arr={1,3,1,8,10,13};
//        int[] arr={4,3,2,1};
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }
}
