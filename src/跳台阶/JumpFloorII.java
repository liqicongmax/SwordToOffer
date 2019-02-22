package 跳台阶;

/**
 * Created by viruser on 2018/12/20.
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII {
    public static int solution(int n){
        if(n<=2){
            return n;
        }
        return solution(n-1)*2;

    }
}
