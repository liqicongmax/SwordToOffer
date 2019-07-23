package Tree;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 15:26
 */
public class InOrderAndPostOrderToTree {
    /**
     * 中序后序生成树
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0){
            return null;
        }
        TreeNode node=new TreeNode(postorder[postorder.length-1]);
        for(int i=0;i<inorder.length;i++){
            if(postorder[postorder.length-1]==inorder[i]){
                node.left=buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,i));
                node.right=buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,i,postorder.length-1));
            }
        }
        return node;
    }
}
