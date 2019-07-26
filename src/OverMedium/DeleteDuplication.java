package OverMedium;

import Tree.TreeNode;
import 链表.ListNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/26 13:35
 */
public class DeleteDuplication {
    /**
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
     * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     *
     * @return
     */
    public ListNode deleteDuplication(ListNode root) {
        ListNode node = root;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (node = root; node != null; node = node.next) {
            if (!map.keySet().contains(node.val)) {
                map.put(node.val, 1);
            } else {
                map.put(node.val, map.get(node.val) + 1);
            }
        }
        ListNode pre = null;
        go:
        for (node = root; node != null; node = node.next) {
            if (map.keySet().contains(node.val) && map.get(node.val) > 1) {
                //删除节点区分是头结点还是普通节点
                if (node.val == root.val) {
                    root = root.next;
                    //node=root;
                } else {
                    pre.next = node.next;
                }
                continue go;
            }
            pre = node;
        }
        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }
        return root;
    }

    public static ListNode deletedump(ListNode root) {
        if (root == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = root;
        go:while (cur != null&&cur.next!=null) {
            while (cur.next != null && cur.val != cur.next.val) {
                pre = cur;
                cur = cur.next;
            }
            while (cur!=null&&cur.next != null && cur.val == cur.next.val) {
                if (cur.val == root.val) {
                    int val=root.val;
                    while(cur!=null&&cur.val==val){
                        root=root.next;
                        cur=cur.next;
                    }
                    continue go;
                } else {
                    int val=cur.val;
                    while (cur!=null&&cur.val==val) {
                        cur = cur.next;
                    }
                    pre.next=cur;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
//        new DeleteDuplication().deleteDuplication(n1);
        deletedump(n1);
        while (n1!=null){
            System.out.println(n1.val);
            n1=n1.next;
        }

    }
}
