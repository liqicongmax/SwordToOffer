package 代码的完整性;

/**
 * Created by viruser on 2018/12/21.
 */

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 在不使用Math.pow的情况下实现求幂的功能
 */
public class Power {
    /**
     * 直接调Math库函数，显然这样不会得到offer
     * @param base
     * @param exponent
     * @return
     */
    public static double solution(double base,int exponent){
        return Math.pow(base,exponent);
    }

    /**
     * 先判断指数为负时底数是否为0
     * @param base
     * @param exponent
     * @return
     */
    public static double solution1(double base,int exponent){
        double cur=base;
        if(base==0&&exponent<0){
            throw new RuntimeException("分母不能为0");
        }
        if(exponent==0){
            return 1;
        }
        if(exponent<0){
            cur=1/cur;
            base=1/base;
            exponent=Math.abs(exponent);
        }
        for(int i=0;i<exponent-1;i++){
            cur=cur*base;
        }
        return cur;
    }

}
