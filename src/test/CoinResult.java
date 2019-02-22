package test;

/**
 * Created by viruser on 2018/12/22.
 */
public class CoinResult {
    public static int solution1(int target){
        if(target==2||target==1){
            return target;
        }
        if(target<0){
            return 0;
        }
        //return solution1(target-1)+solution1(target-2)+solution1(target-5)+solution1(target-0.1f);
        return solution1(target-1)+solution1(target-2)+solution1(target-5);
    }
    public static void main(String[] args){
        System.out.println(solution1(6));
    }
}
