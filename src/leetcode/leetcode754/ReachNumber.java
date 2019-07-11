package leetcode.leetcode754;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/11 11:13
 */
public class ReachNumber {
    /**
     * 在一根无限长的数轴上，你站在0的位置。终点在target的位置。
     *
     * 每次你可以选择向左或向右移动。第 n 次移动（从 1 开始），可以走 n 步。
     *
     * 返回到达终点需要的最小移动次数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reach-a-number
     */
    public static int reachNumber(int target){
        target=Math.abs(target);
        if(target==1){
            return 1;
        }
        int sum=0;
        int i=0;
        //一直加直到sum-target为一个偶数2n,在前面找个数字n反向走就行了
        while(true){
            i++;
            sum+=i;
            if(sum>=target&&((sum-target)%2==0)){
                break;
            }

        }
        return i;
    }
    public static void main(String[] args){
        System.out.println(reachNumber(4));
    }
}
