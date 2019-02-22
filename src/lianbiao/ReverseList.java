package lianbiao;

/**
 * Created by viruser on 2018/12/25.
 */

import java.util.Stack;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
    public ListNode solution(ListNode head){
        if(head==null){
            return null;
        }
        ListNode node=head;
        Stack<ListNode> stack=new Stack<>();
        while(node.next!=null){
            stack.push(node);
            node=node.next;
        }
        stack.push(node);
        ListNode newhead=node;
        ListNode newnode=newhead;
        while(!stack.isEmpty()){
            newnode.next=stack.pop();
            newnode=newnode.next;
        }
        newnode.next=null;


        return newhead;
    }

    /**
     * 优化后的写法，不需要创建一个栈去保存节点,
     * 看起来简单，不过时间和占用内存都不如上面那个
     * @param head
     * @return
     */
    public ListNode solution1(ListNode head){
        if(head==null){
            return null;
        }
        ListNode node=head;
        ListNode newhead=null;
        ListNode tmp=null;
        ListNode pre=null;
        while(node!=null){
            tmp=node.next;
            node.next=pre;
            if(tmp==null){
                newhead=node;
            }
            pre=node;
            node=tmp;
        }
        return newhead;
    }
}
