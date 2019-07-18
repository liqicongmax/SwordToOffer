package 链表;

/**
 * Created by viruser on 2018/12/25.
 */

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {
    public static ListNode solution(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode node1=list1;
        ListNode node2=list2;
        ListNode node=null;
        ListNode head=null;
        while(node1!=null&&node2!=null){
            if(node1.val>node2.val){
                if(head==null){
                    head=node=node2;
                }else {
                    node.next = node2;
                    node = node.next;
                }
                node2=node2.next;
            }else{
                if(head==null){
                    head=node=node1;
                }else{
                    node.next=node1;
                    node=node.next;
                }
                node1=node1.next;
            }


        }
        //把两个链表比较完之后的接上
        if(node1==null){
            node.next=node2;
        }else {
            node.next=node1;
        }
        return head;
    }

    /**
     * 递归的方法合并两个有序链表
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode solution1(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            list1.next=solution1(list1.next,list2);
            return list1;
        }else{
            list2.next=solution1(list1,list2.next);
            return list2;
        }
    }
}
