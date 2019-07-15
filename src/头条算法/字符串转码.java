package 头条算法;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 15:17
 */
public class 字符串转码 {
    /**
     * todo
     * 编程题:A~Z从0~25编号，给一串字符串（只有数字），问有多少种编码方式。比如12可以编码成BC或者M。
     */
    public static int solution(String s){
        if (s.length()==0){
            return 0;
        }
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        for(int i=1;i<s.length()+1;i++){
            dp[i]+=dp[i-1];
            if(i>1){
                int num=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                if(num==0){
                    return 0;
                }
                if(num==10||(num>=11&&num<=25)){
                    dp[i]+=dp[i-2];
                }
            }
        }

        return dp[s.length()];
    }
    public static void main(String[] args){
        System.out.println(solution("08"));
    }
}
