package 队列和栈;

/**
 * Created by viruser on 2018/12/26.
 */

import java.util.Arrays;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 设计一个数据结构，要考虑的东西是挺多的，这只是一个简单的栈加个功能而已
 */
public class DefineStack {
    private int size;
    private int min=Integer.MAX_VALUE;
    private Integer[] elements=new Integer[10];
    Stack<Integer> stack=new Stack<>();

    /**
     * 入栈时数组若容量不足需进行扩容
     */
    public void ensurecapcity(int size){
        int len=elements.length;
        if(size>len){
            int newlen=(len*3)/2+1;
            elements= Arrays.copyOf(elements,newlen);
        }
    }

    public void push(int node) {
        ensurecapcity(size+1);
        elements[size++]=node;
        if(node<min){
            stack.push(node);
            min=stack.peek();
        }else{
            stack.push(min);
        }
    }

    public void pop() {
        Integer top=top();
        if(top!=null){
            elements[size--]=(Integer)null;
        }
        stack.pop();
        min=stack.peek();
    }

    private int top() {
        if(!stack.isEmpty()){
            if(size>=1){
                return elements[size-1];
            }
        }
        return (Integer)null;
    }

    public int min(){
        return min;
    }
}
