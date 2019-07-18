package 链表;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/18 15:17
 */
public class FindEntryOfLoop {
    /**
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     * @param pHead
     * @return
     */
    public static ListNode findEntryOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null||pHead.next.next==null){
            return null;
        }
        ListNode n1=pHead;
        ListNode n2=pHead;
        while(n1!=null&&n2!=null){
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2){
                n1=pHead;
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
