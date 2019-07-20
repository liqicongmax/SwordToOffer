package practice;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author liqicong
 * @Date 2019/7/18 19:46
 * @Description
 */
public class BreadthFirstTraversal {
    private ArrayList<ArrayList<Integer>> breadthFirstTraversal(TreeNode root){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        ArrayList<Integer> temp=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int start=0;
        int end=1;
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            temp.add(node.value);
            start++;
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
            if(start==end){
                end=queue.size();
                start=0;
                list.add(temp);
                temp=new ArrayList<>();
            }
        }
        return list;
    }
}
