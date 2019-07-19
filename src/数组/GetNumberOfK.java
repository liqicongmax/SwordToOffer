package 数组;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/18 18:55
 */
public class GetNumberOfK {
    /**
     * 统计一个数K在排序数组arr中出现的次数
     * @param arr 排序数组
     * @param k 给定数字k
     * @return 出现次数
     */
    public static int getNumberOfK(int[] arr,int k){
        int place=binarySearch(arr,k);
        if(place==-1||arr.length==0){
            return 0;
        }
        int pre=place-1;
        int after=place+1;
        int count=1;
        while((pre>=0&&arr[pre]==k)){
            pre--;
            count++;
        }
        while(after<arr.length&&arr[after]==k){
            after++;
            count++;
        }
        return count;
    }
    public static int binarySearch(int[] arr,int k){
        if(arr.length==0){
            return 0;
        }
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=(end-start)/2+start;
            if(k<arr[mid]){
                end=mid-1;
            } else if(k>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={3};
        System.out.println(getNumberOfK(arr,3));
    }
}
