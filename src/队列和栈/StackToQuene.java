package 队列和栈;

/**
 * Created by viruser on 2018/12/19.
 */

import java.util.Stack;

/**
 * 两个栈实现一个队列，完成队列的push和pop操作，先进先出，后进后出
 */
public class StackToQuene {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //stack1用来放输入的，stack2用来倒着输出

    public void push(int node) {
        stack1.push(node);
        //stack2.push(stack1.pop());
    }

    public int pop() {
        if(stack1.isEmpty()&&stack2.isEmpty()){
            throw new RuntimeException("当前队列内无数据");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
