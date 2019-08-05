package 位运算;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/5 16:31
 */
public class Divide {
    /**
     * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
     * 返回被除数 dividend 除以除数 divisor 得到的商。
     * 链接：https://leetcode-cn.com/problems/divide-two-integers
     *
     * @param dividend
     * @param divisor
     * @return
     */
    private static final int ERROR_NUM = Integer.MAX_VALUE - 1;

    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return -1;
        }
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        int result=0;
        long t=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        for(int i=31;i>=0;i--){
            if(t>>i>=d){//减去2的n次方个被除数,如果还大于等于,就继续减去,把几步中几个2的n次方加起来,就是商
                result+=1<<i;//结果相加
                t-=d<<i;//减去2的N次方个被除数
            }
        }
        return (dividend^divisor)<0?(Math.abs(result)*-1):(Math.abs(result));
    }
    private static int divide1(int dividend,int divisor){
        if (divisor == 0) {
            return -1;
        }
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        int t=Math.abs(dividend);
        int d=Math.abs(divisor);
        int result=0;
        int temp;
        while(t>=d){
            temp=divisor;
            int k=1;
            while(t>=(temp+temp)){
                k+=k;
                temp+=temp;
            }
            result+=k;
            t=t-temp;
        }
        return (dividend^divisor)<0?(Math.abs(result)*-1):(Math.abs(result));
    }

    public static void main(String[] args) {
        System.out.println(divide1(10000, 3));
    }
}
