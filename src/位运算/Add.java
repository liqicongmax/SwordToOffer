package 位运算;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/2 19:34
 */
public class Add {
    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     * @param a
     * @param b
     * @return
     */
    public static int add(int a,int b){
        while(a!=0){
            int temp=a^b;
            a=(a&b)<<1;
            b=temp;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(add(111,899));
    }
}
