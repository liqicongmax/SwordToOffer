package OverMedium;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/5 10:14
 */
public class TwoArrayMidNum {
    /**
     * 两个升序数组找其中位数
     * 有几种情况,如果短数组全部比长数组大或者全部比长数组小,那么只需要从长数组中获取中位数即可,
     * @param arr1 升序数组1
     * @param arr2 升序数组2
     * @return 中位数
     */
    public static double twoArrayMidNum(int[] arr1,int[] arr2){

        int m=arr1.length;
        int n=arr2.length;
        if(m>n){
            return twoArrayMidNum(arr2,arr1);
        }
        int start=0;
        int end=m;
        int mid=(m+n+1)/2;
while (start<=end){
            int i=(start+end)/2;
            int j=mid-i;
            if(i>start&&arr1[i-1]>arr2[j]){
                end=i-1;
            }else if(i<end&&arr2[j-1]<arr1[i]){
                start=i+1;
            }else{
                int maxLeft=0;
                if(i==0){
                    maxLeft=arr2[j-1];
                }else if(j==0){
                    maxLeft=arr1[i-1];
                }else{
                    maxLeft=Math.max(arr1[i-1],arr2[j-1]);
                }
                if((m+n)%2==1){
                    return maxLeft;
                }
                int minRight=0;
                if(i==m){
                    minRight=arr2[j];
                }else if(j==n){
                    minRight=arr1[i];
                }else{
                    minRight=Math.max(arr1[i],arr2[j]);
                }
                if((m+n)%2==0){
                    return (maxLeft+minRight)/2.0;
                }
            }
        }
        return 0.0;
    }
    public static void main(String[] args){
        int[] arr1={11,12,13};
        int[] arr2={4,5,6,7,8,9,10};
        System.out.println(twoArrayMidNum(arr1,arr2));
    }

}
