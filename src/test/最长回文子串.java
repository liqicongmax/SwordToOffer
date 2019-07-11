package test;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/11 9:37
 */
public class 最长回文子串 {
    public static int longest(String s){
        int[][] dp=new int[s.length()][s.length()];
        int max=0;
        String s1=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++) {
                if (s.charAt(i) == s1.charAt(j)) {
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else {
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    max=max>dp[i][j]?max:dp[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(longest("abcba"));
    }
}
