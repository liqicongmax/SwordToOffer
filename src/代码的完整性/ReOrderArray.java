package 代码的完整性;

/**
 * Created by viruser on 2018/12/21.
 */

/**
 *  输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *  使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    /**
     * 类似冒泡排序，前偶数后奇数就换位
     * @param arr
     */
    public static void solution(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]%2==1&&arr[j-1]%2==0){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        solution(new int[]{1,3,5,7,2,4,6});
    }
}
