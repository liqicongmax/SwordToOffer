package 链表;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/18 14:41
 */
public class FindFirstCommonNode {
    /**
     * 输入两个链表，找出它们的第一个公共结点。
     * @param node1
     * @param node2
     * @return
     */
    public static ListNode findFirstCommonNode(ListNode node1,ListNode node2){
        ListNode n1=node1;
        ListNode n2=node2;
        if(node1==null||node2==null){
            return null;
        }
        int length1=calLength(n1);
        int length2=calLength(n2);
        int distance=Math.abs(length1-length2);
        if(length1>length2){
            for(int i=0;i<distance;i++){
                n1=n1.next;
            }
        }
        if(length2>length1){
            for(int i=0;i<distance;i++){
                n2=n2.next;
            }
        }
        while(n1!=null&&n2!=null){
            if(n1.val==n2.val){
                return n1;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return null;

    }
    private static int calLength(ListNode node){
        int i=0;
        if(node==null){
            return 0;
        }
        while (node!=null){
            i++;
            node=node.next;
        }
        return i;
    }
}
