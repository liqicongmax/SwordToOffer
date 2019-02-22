package 队列和栈;

/**
 * Created by viruser on 2018/12/27.
 */

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

 */
public class IsPopOrder {
    /**
     * 设置一个辅助栈和一个辅助的用来标记pop位置的索引popindex，
     * 先按入栈顺序入一个，再while判断当前辅助栈栈顶是否为出栈顺序位中的元素，如果是，popindex+1，然后辅助栈pop，把所有的出栈顺序位上的都判断一遍
     * 最后每个入栈顺序都判断完，如果辅助栈未完全出栈，则说明顺序不对
     * @param pushA
     * @param popA
     * @return
     */
    public static boolean solution(int[] pushA,int[] popA){
        int size=pushA.length;
        if(size==0){
            return false;
        }
        int popindex=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<size;i++){
            s.push(pushA[i]);
            while(!s.isEmpty()&&s.peek()==popA[popindex]){
                s.pop();
                ++popindex;
            }
        }
        return s.isEmpty();
    }
}
