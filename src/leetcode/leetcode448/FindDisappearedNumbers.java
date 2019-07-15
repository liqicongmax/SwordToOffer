package leetcode.leetcode448;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 11:09
 */
public class FindDisappearedNumbers {
    /**
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     *
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     *
     * @param arr s
     * @return s
     */
    public static List<Integer> findDisappearedNumbers(int[] arr){
        List<Integer> list=new ArrayList<>();
        if(arr.length==0){
            return list;
        }
        for(int i=0;i<arr.length;i++){
            arr[Math.abs(arr[i])-1]=-1*Math.abs(arr[Math.abs(arr[i])-1]);

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
