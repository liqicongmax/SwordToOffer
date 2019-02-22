package 数组;

/**
 * Created by viruser on 2018/12/20.
 */

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 */
public class Fibonacci {
    /**
     * 这种写法重复计算了很多次，在n太大的情况下会出现Stack Overflow
     * @param n
     * @return
     */
    public static int solution(int n){
        if(n==0||n==1){
            return n;
        }

        return solution(n-1)+solution(n-2);
    }

    /**
     * 采用空间换时间的算法，用一个数组保存每次的计算结果
     * 但是只需要第n个数，显然前面n-1个都是浪费空间的
     * @param n
     * @return
     */
    public static int solution1(int n){
        if(n<=1){
            return n;
        }
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    /**
     * 动态规划，只保存第N个数
     * @param n
     * @return
     */
    public static int solution2(int n){
        if(n<=1){
            return n;
        }
        int before=1;
        int bbefore=1;
        int current=0;
        for(int i=2;i<n+1;i++){
            current=before+bbefore;
            bbefore=before;
            before=current;
        }
        return current;
    }
    public static void main(String[] args){
        System.out.println(solution2(2));
    }
}
