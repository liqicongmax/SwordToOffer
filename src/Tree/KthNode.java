package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 8:35
 */
public class KthNode {
    /**
     * 给定一棵二叉搜索树，请找出其中的第k小的结点。
     * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
     * @param root
     * @param k
     * @return
     */
    TreeNode KthNode(TreeNode root, int k) {
        int temp=1;
        if(k<1){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.peek();
            if(temp==k){
                return root;
            }
            temp++;
            stack.pop();
            root=root.right;
        }
        return null;
    }
}
