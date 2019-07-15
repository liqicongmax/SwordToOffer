package leetcode.leetcode41;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 12:17
 */
public class FirstMissingPositiveNum {

    /**
     * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数
     *        如[1,2,0]返回3,       [3,4,-1,1]返回2,       [7,8,9,11,12]返回1
     * @param arr
     * @return
     */
    private static int firstMissingPositive(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            while(arr[i]>0&&arr[i]<len&&arr[arr[i]-1]!=arr[i]){
                swap(arr,arr[i]-1,i);
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]-1!=i){
                return i+1;
            }
        }
        return len+1;
    }
    private static void swap(int[] nums, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void main(String[] args){
        int[] arr={1,5,3,6,4,7};
        firstMissingPositive(arr);
    }
}
