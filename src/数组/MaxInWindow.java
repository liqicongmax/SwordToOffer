package 数组;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 7:41
 */
public class MaxInWindow {
    /**
     * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
     * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
     * 他们的最大值分别为{4,4,6,6,6,5}；
     * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
     * @param num
     * @param size
     * @return
     */

    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list=new ArrayList<>();
        if(size>(num.length)||size==0){
            return list;
        }
        int maxIndex=0;
        int startIndex=0;
        int last=size-1;
        while (last<num.length){
            if(maxIndex!=startIndex-1&&startIndex!=0){
                if(num[maxIndex]<num[last]){
                    maxIndex=last;
                    startIndex++;
                    last++;
                    list.add(num[maxIndex]);
                }else{
                    list.add(num[maxIndex]);
                    ++startIndex;
                    ++last;
                    continue;
                }
            }else {
                maxIndex=startIndex;
                for (int i = startIndex; i <=last; i++) {
                    if (num[i] > num[maxIndex]) {
                        maxIndex = i;
                    }
                }
                list.add(num[maxIndex]);
                startIndex++;
                last++;
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,2,6,2,5,1};
        ArrayList<Integer> list=maxInWindows(arr,3);
        list.forEach(System.out::println);
    }
}
