package 链表;

/**
 * Created by viruser on 2018/12/25.
 */

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public static ListNode solution(ListNode head,int k){
        ListNode first=head;
        ListNode second=head;
        if(head==null||k<=0){
            return null;
        }
        for(int i=1;i<k;i++){
            if(first.next!=null){
                first=first.next;
            }else{
                return null;
            }
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        return second;
    }
}
