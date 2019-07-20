package Tree;

/**
 * Created by viruser on 2018/12/27.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的广度优先遍历，非递归版
 */
public class BinaryTreeTraversal {
    public ArrayList<Integer> solution(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return null;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode treeNode=queue.poll();
            if(root.left!=null){
                queue.offer(treeNode.left);
            }
            if(root.right!=null){
                queue.add(treeNode.left);
            }
            list.add(treeNode.value);
        }
        return list;
    }
}
