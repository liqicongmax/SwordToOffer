package 链表;

import java.util.ArrayList;

public class PrintListFromTailToHead {
    /**
     * 最简单的就是正序输出到一个list,采用头插法每次把新的数据插入到0位置，不过每次插入都会造成一批数据的移位，耗时比较长
     * @param node
     * @return
     */
    public ArrayList<Integer> solution1(ListNode node){
        ArrayList<Integer> list=new ArrayList<>(20);
        while(node!=null){
            list.add(0,node.val);
            node=node.next;
        }
        return list;
    }

    ArrayList<Integer> solution2res;

    /**
     * 采用递归的方式，先跑到链表的末尾，再从末尾回归添加到list
     * @param node
     * @return
     */
    public ArrayList<Integer> solution2(ListNode node){
        if(node!=null){
            solution2(node.next);
            solution2res.add(node.val);
        }
        return solution2res;
    }
}
