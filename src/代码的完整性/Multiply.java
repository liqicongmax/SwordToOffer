package 代码的完整性;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/4 16:50
 */
public class Multiply {
    public static void main(String[] args){
        System.out.println(sum(2));
    }

    /**
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * @param n
     * @return
     * 利用逻辑与的短路特性实现递归终止
     */
    public static int sum(int n){
        int result=n;
        boolean f=n>0 && ((result += sum(n-1))>0);
        return result;
    }
}
