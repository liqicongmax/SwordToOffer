package 查找;

/**
 * Created by viruser on 2018/12/19.
 */

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，\
 输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
    /**
     * 简单地遍历，如果出现前一项大于后一项，直接return后一项就行了
     * @param arr
     * @return
     */
    public int solution(int[] arr){
        int size=arr.length;
        if(size==0){
            return 0;
        }
        if(size==1){
            return arr[0];
        }
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                return arr[i+1];
            }
        }
        return 0;
    }

    /**
     * 二分查找,
     * @param arr 2,3,4,5,1
     * @return
     */
    public static int erfensolution(int[] arr){
        int start=0;
        int middle=0;
        int end=arr.length-1;
        if(arr.length==0){
            return 0;
        }
        while(arr[start]>=arr[end]){
            if(end-start==1){
                middle=end;
                break;
            }
            middle=start+(end-start)/2;
            if(arr[middle]>=arr[start]){
                start=middle;
            }
            if(arr[middle]<=arr[end]){
                end=middle;
            }

        }
        return arr[middle];
    }
    public static void main(String[] args){
        System.out.println(erfensolution(new int[]{3,4,5,1,2}));
    }
}
