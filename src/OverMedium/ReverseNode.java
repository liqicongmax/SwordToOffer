package OverMedium;

import 链表.ListNode;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/26 16:36
 */
public class ReverseNode {
    /**
     * 链表反转并返回头结点
     * @param root
     * @return
     */
    public ListNode reverseNode(ListNode root){
        if(root==null){
            return null;
        }
//        while(root!=null){
//            reverseNode(root.next);
//            System.out.println(root.val);
//        }
        //以上是链表倒转输出
        ListNode pre=null;
        ListNode cur=root;
        while(cur!=null){

            cur.next=pre;
            pre=cur;
            cur=cur.next;
            if(cur.next==null){
                return cur;
            }
        }
        return null;
    }
}
