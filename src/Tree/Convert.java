package Tree;

import java.util.Stack;


/**
 * @author liqicong@myhexin.com
 * @date 2019/7/19 16:25
 */
public class Convert {

    /**
     * 将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
     * @param root 根节点
     * @return
     * TODO
     */
    public TreeNode convert(TreeNode root){
        if (root==null){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        TreeNode start=null;
        while(!stack.isEmpty()||node!=null){
            if(node!=null){
                stack.push(node);
                node=node.right;
            }else {
                node=stack.pop();
                if(start==null){
                    start=node;
                }else{
                    start.left=node;
                    node.right=start;
                    start=node;
                }
            }
            node=node.left;
        }
        return start;
    }
}
