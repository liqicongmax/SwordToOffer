package 位运算;

/**
 * Created by viruser on 2018/12/21.
 */

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {
    public static int solution(int n){
        int cur=n;
        int temp=0;
        if(cur==1){
            return 1;
        }
        while(n!=0){
            n=n/2;
            if(n!=0) {
                temp++;
            }
        }
        return solution(cur-(int)Math.pow(2,temp))+1;
    }
    public static int solution1(int n){
        int count=0;
        while(n!=0){
            ++count;
            n=n&(n-1);
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(solution(7));
    }
}
