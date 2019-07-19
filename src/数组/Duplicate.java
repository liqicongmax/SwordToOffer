package 数组;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/19 15:58
 */
public class Duplicate {
    /**
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
     * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     * @param numbers 数组大小在0~n-1
     * @param n 数组长度
     * @param duplication 返回值放到duplication[0]
     * @return
     */
    public boolean duplicate(int[] numbers,int n,int [] duplication) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(arr[numbers[i]]==0){
                arr[numbers[i]]=-1;
                continue;
            }
            if(arr[numbers[i]]==-1){
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
    public boolean duplicate1(int[] numbers,int n,int[] duplication) {
        if(n==0||numbers.length==0){
            duplication[0]=-1;
            return false;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[Math.abs(numbers[i])]>=0){
                numbers[Math.abs(numbers[i])]*=-1;
                continue;
            }
            if(numbers[Math.abs(numbers[i])]<0){
                duplication[0]=Math.abs(numbers[i]);
                return true;
            }
        }
        duplication[0]=-1;
        return false;
    }
}
