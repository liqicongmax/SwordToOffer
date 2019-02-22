package 贝壳面经算法题;

/**
 * Created by viruser on 2018/12/24.
 */

import java.util.Arrays;

/**
 * 手撕代码，有n个物品，每次最多拿100个，然后没走一步会掉一个，求走100步之后剩余的最大数量
 */
public class Qudongxi {
    /**
     *
     * @param n 参数为物品个数，如果小于100，就在最后一步拿n个，然后掉一个剩n-1个
     * @return
     */
    public static int remain(int n){
        int cur=n;
        if(n<100){
            return n-1;
        }
        //要尽量在最后几步把所有物品拿完，然后走的步数也是最少的
        int temp=1;
        while(cur>100){
            cur-=100;
            temp++;
        }


        return (n-temp)>9900?9900:(n-temp);
    }
    public static void main(String[] args){
        System.out.println(remain(100001));
    }
}
