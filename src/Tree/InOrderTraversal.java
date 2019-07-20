package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/19 16:49
 */
public class InOrderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root){
        ArrayList<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.add(node);
                node=node.left;
            }
            node=stack.peek();
            list.add(node.value);
            stack.pop();
            node=node.right;
        }
        return list;
    }
}
