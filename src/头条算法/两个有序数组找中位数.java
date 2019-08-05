package 头条算法;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/17 17:03
 */
public class 两个有序数组找中位数 {
    public static double getMidBetweenTwoArray(int[] arr1,int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        if(m>n){
            return getMidBetweenTwoArray(arr2,arr1);
        }
        int start=0;
        int end=m;
        int mid=(m+n+1)/2;
        while(start<=end){
            int i=(start+end)/2;
            int j=mid-i;
            if(i>start&&arr1[i-1]>arr2[j]){
                end=i-1;
            }else if(i<end&&arr2[j-1]>arr1[i]){
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
                }else {
                    minRight=Math.min(arr1[i],arr2[j]);
                }
                if((m+n)%2==0){
                    return (maxLeft+minRight)/2.0;
                }
            }
        }
        return 0.0;
    }
}
