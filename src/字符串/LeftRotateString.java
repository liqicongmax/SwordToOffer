package 字符串;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/18 16:04
 */
public class LeftRotateString {
    /**
     * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
     * @param str 输入的字符串
     * @param n 偏移位
     * @return 偏移后字符串
     */
    public static String leftRotateString(String str,int n){
        if(n<0){
            return null;
        }
        while (n>str.length()){
            n=n-str.length();
        }
        String temp=str.substring(0,n);
        StringBuilder sb=new StringBuilder(str.substring(n));
        return sb.append(temp).toString();
    }
}
