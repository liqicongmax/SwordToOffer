package 队列和栈;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class StackAndQueue {
    public static ArrayList<Integer> solution(int[] num, int size) {
        if (size == 0 || num.length < size) {
            return null;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int newsize = num.length - size + 1;//arraylist的长度
        ArrayList<Integer> result = new ArrayList<>(newsize);
        for (int i = 0; i <= newsize; i++) {
            temp.clear();
            for (int j = 0; j < 4; j++) {
                temp.add(num[i + j]);
            }
            result.add(Collections.max(temp));
        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> i=solution(new int[]{1,2,3,4},0);
        if(i!=null) {
            for (Integer ss : i) {
                System.out.println(ss);
            }
        }
    }
}
