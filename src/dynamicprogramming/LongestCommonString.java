package dynamicprogramming;

/**
 * 最长公共子串
 * @author liqicong@myhexin.com
 * @date 2019/7/8 10:26
 */
public class LongestCommonString {
    public int longestCommonString(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n==0||m==0){
            return 0;
        }
        int max=0;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else{
                        //获取左上角的长度,每次有新的点长度就加1
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    //每次生成完最新的长度之后和max去比,大就替换
                    max=max<dp[i][j]?dp[i][j]:max;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        String s1="123abcba22";
        System.out.println(new StringBuilder(s1).reverse().toString());
        System.out.println(new LongestCommonString().longestCommonString(s1,new StringBuilder(s1).reverse().toString()));
    }
}
