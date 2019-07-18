package practice;

import 链表.ListNode;
import 树.TreeNode;

/**
 * @Author liqicong
 * @Date 2019/7/18 19:38
 * @Description
 */
public class FindCircle {
    private static ListNode findCircle(ListNode node){
        if(node==null||node.next==null){
            return null;
        }
        ListNode n1=node;
        ListNode n2=node;
        while(n1.next!=null){
            n1=n1.next.next;
            n2=n2.next;
            if(n1==n2){
                n1=node;
                while(n1!=n2){
                    n1=n1.next;
                    n2=n2.next;
                }
                if(n1==n2){
                    return n1;
                }
            }
        }
        return null;
    }
}
