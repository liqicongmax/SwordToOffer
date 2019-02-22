package 秋招2019拼多多算法题;

/**
 * 有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。
 * 输入描述:
 * 空格分隔的两个字符串，代表输入的两个大整数
 * 输出描述:
 * 输入的乘积，用字符串表示
 */
import java.math.BigDecimal;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        BigDecimal b1=new BigDecimal(num1);
        BigDecimal b2=new BigDecimal(num2);
        System.out.println(b1.multiply(b2));
    }
}