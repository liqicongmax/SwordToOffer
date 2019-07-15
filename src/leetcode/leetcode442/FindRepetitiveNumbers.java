package leetcode.leetcode442;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 10:22
 */
public class FindRepetitiveNumbers {
    /**
     * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次
     * 找到所有出现两次的元素。
     * 不用到任何额外空间并在O(n)时间复杂度
     * 解法:用数组中元素来当索引,把遍历过程中遇到的都取相反数,如果有相同的,就会获取到这个相反数,取绝对值后放到list
     * @param arr s
     * @return s
     */
    private static List<Integer> findRepetitiveNumbers(int[] arr){
        List<Integer> result=new ArrayList<>();
        if(arr.length==0){
            return result;
        }
        for(int i:arr){
            if(arr[Math.abs(i)-1]>0){
                arr[Math.abs(i)-1]=-1*arr[Math.abs(i)-1];
            }else {
                result.add(Math.abs(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,3,3};
        findRepetitiveNumbers(arr);
    }
}
