package dynamicprogramming;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/12 17:07
 */
public class MaxSequence {
    /**
     * 求取数组中最大连续子序列和，例如给定数组为A={1， 3， -2， 4， -5}， 则最大连续子序列和为6，即1+3+（-2）+ 4 = 6
     *这种解法是把所有可能的连续子序列都遍历完了,通过创建一个max来保存最后的值
     * @param arr
     * @return
     */
    public static int maxSequence1(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1,3,-2,4,-5};
        System.out.println(maxSequence1(arr));
    }
}
