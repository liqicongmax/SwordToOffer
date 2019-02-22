package 跳台阶;

/**
 * Created by viruser on 2018/12/20.
 */

import 数组.Fibonacci;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    /**
     * 假设每次都跳2级，一共是n/2(m)次，m中间穿插1组1级，就是m种，2组1级就是(1+...+m-1)种，3组1级就是..直到m组1级，也就是全部1级，排列组合的方法
     *
     * @param n
     * @return
     */
    public static int solution(int n){
        return 0;
    }

    /**
     *跟求Fibonacci数列一样
     * @param target
     * @return
     */
    public static int solution1(int target){
        if(target<=2){
            return target;
        }
        return solution1(target-1)+solution1(target-2);
    }
}
