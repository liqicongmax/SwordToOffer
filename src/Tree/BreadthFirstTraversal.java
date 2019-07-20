package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/18 17:05
 */
public class BreadthFirstTraversal {
    /**
     * 二叉树的层序遍历
     *
     * @param root 根节点
     * @return
     */
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        if (root == null) {
            return list;
        }
        queue.offer(root);
        int start=0;
        int end=1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            temp.add(node.value);
            start++;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
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
