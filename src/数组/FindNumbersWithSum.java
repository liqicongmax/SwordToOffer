package 数组;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/19 15:29
 */
public class FindNumbersWithSum {
    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> findNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        if(array.length==0){
            return list;
        }
        int start=0;
        int end=array.length-1;

        while(start<end){
            if((array[start]+array[end])==sum){
                list.add(array[start]);
                list.add(array[end]);
                return list;
            } else if((array[start]+array[end])>sum){
                end--;
            }else {
                start++;
            }
        }


        return list;
    }
}
