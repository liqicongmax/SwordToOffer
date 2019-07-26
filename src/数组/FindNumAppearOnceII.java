package 数组;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/26 11:10
 */
public class FindNumAppearOnceII {
    /**
     * 给定个数组,只有一个数是只出现一次的,其他都是出现两次且重复的都相邻,找出这个出现一次的数
     * @param arr
     * @return
     */
    public static int findAppearOnce(int[] arr){
        if (arr.length==1){
            return arr[0];
        }
        if(arr.length%2==0){
            return -1;
        }
        int mid=arr.length/2;
        int start=0;
        int end=arr.length-1;
        for(;;){
            mid=(start+end)/2;
            if(mid+1<arr.length&&arr[mid]==arr[mid+1]){
                start=mid+2;
            }else if(mid-1>=0&&arr[mid]==arr[mid-1]){
                end=mid-2;
            }else{
                return arr[mid];
            }
        }
    }
    public static void main(String[] args){
        int[] arr={2,2,4,4,1};
        System.out.println(findAppearOnce(arr));
    }
}
