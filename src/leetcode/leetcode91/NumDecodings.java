package leetcode.leetcode91;

/**
 * @Author liqicong
 * @Date 2019/7/15 20:54
 * @Description
 */
public class NumDecodings {
    /**
     * A~Z从1~26编号，给一串字符串（只有数字），问有多少种编码方式。比如12可以编码成BC或者M。
     *
     * @param s s
     * @return s
     */
    private static int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        if (s.charAt(0) == '0') {
            return 0;
        }
        for (int i = 1; i < s.length() + 1; i++) {
            if(s.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
            if(i>1){
                int num=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                if(num==0){
                    return 0;
                }
                if(num>9&&num<27){
                    dp[i]+=dp[i-2];
                }
            }

        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("12"));
    }
}
