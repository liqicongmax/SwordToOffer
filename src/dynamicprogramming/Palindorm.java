package dynamicprogramming;

/**
 * 最长回文子串长度
 * @author liqicong@myhexin.com
 * @date 2019/7/8 11:19
 */
public class Palindorm {
    /**
     * 可以看成是字符串和字符串的反转的最长公共子串
     * @param s
     * @return
     */
    public int solution(String s){
        System.out.println(new LongestCommonString().longestCommonString(s,new StringBuilder(s).reverse().toString()));
        return new LongestCommonString().longestCommonString(s,new StringBuilder(s).reverse().toString());
    }
}
