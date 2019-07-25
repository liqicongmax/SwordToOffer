package 头条算法;

import 链表.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author liqicong
 * @Date 2019/7/25 21:27
 * @Description
 */
public class 链表a中找出与链表b相同的值并删除 {
    /**
     * 链表a中找出与链表b相同的值并删除
     * @param roota 链表a
     * @param rootb 链表b
     */
    public static void DeleteFromASameAsB(ListNode roota,ListNode rootb){
        if(rootb==null||roota==null){
            return;
        }
        ListNode a=roota;
        ListNode b=rootb;
        ListNode pre=null;
        go:for(a=roota;a!=null;a=a.next){
            //拿了个a链表的节点去b链表遍历
            b=rootb;
            while(b!=null){
                if(a.val==b.val){
                    if(a.val==roota.val) {
                        roota = roota.next;
                    }else{
                        pre.next=a.next;
                    }
                    continue go;
                }else {
                    b = b.next;
                }
            }
            pre=a;

        }
        while (roota!=null){
            System.out.println(roota.val);
            roota=roota.next;
        }
    }
    private static void removeNode(ListNode root,int a){
        ListNode pre=null;
        for(ListNode cur=root;cur!=null;cur=cur.next) {
            if(cur.val==a){
                if(cur==root) {
                    root.next=root.next.next;
                    return;
                }else{
                    pre.next=cur.next;
                }
            }else{
                pre=cur;
            }
        }
    }
    public static void main(String[] args){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        ListNode m1=new ListNode(2);
        ListNode m2=new ListNode(3);
        m1.next=m2;
        m2.next=null;
        DeleteFromASameAsB(n1,m1);
//        while (n1!=null){
//            System.out.println(n1.val);
//            n1=n1.next;
//        }

    }
}
