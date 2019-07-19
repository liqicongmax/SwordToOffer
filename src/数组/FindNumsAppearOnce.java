package 数组;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/19 14:12
 */
public class FindNumsAppearOnce {
    /**
     * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
     * @param array 整形数组
     * @param num1 长度为1的数组,用num1[0]来接收参数
     * @param num2 长度为1的数组,用num2[0]来接收参数
     */
    public static void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len=array.length;
        int result=0;
        for(int i=0;i<len;i++){
            result^=array[i];
        }
        //result为所有数字异或的结果,也就是两个不同的数字异或结果
        //共有result种可能性
        int index=findFirst1(result);
        for(int i=0;i<len;i++){
            if(checkIndex(array[i],index)){
                num1[0]^=array[i];
            }else {
                num2[0]^=array[i];
            }
        }
    }

    public static boolean checkIndex(int target,int index){
        return ((target>>index)&1)==1;
    }

    /**
     * 二进制从右向左找到第一个1的位置
     * @param bitResult
     * @return
     */
    public static int findFirst1(int bitResult){
        int index = 0;
        while(((bitResult & 1) == 0) && index < 32){
            bitResult >>= 1;
            index++;
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr={1,1,3,3,2,4};
        findNumsAppearOnce(arr,arr,arr);
        System.out.println(findFirst1(2));
    }
}
