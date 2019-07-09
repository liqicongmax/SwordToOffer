package 树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/2 19:25
 */
public class Bianli {
    public void breadthFirstTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.println(node.value);
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
    }
}
