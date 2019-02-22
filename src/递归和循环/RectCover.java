package 递归和循环;

/**
 * Created by viruser on 2018/12/21.
 */

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public static int solution(int target){
        if(target<=2){
            return target;
        }
        return solution(target-1)+solution(target-2);
    }
}
