package Tree;

import java.util.*;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 10:41
 */
public class PrintTreeAsZhi {
    public ArrayList<ArrayList<Integer>> print(TreeNode root) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        ArrayList<Integer> temp=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int reverse=-1;
        int start=0;
        int end=1;
        while (!queue.isEmpty()){
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
                if(reverse==1) {
                    Collections.reverse(temp);
                    list.add(temp);
                }else {
                    list.add(temp);
                }
                reverse*=-1;
                start=0;
                end=queue.size();
                temp=new ArrayList<>();
            }
        }
        return list;
    }

}
