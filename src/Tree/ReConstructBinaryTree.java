package Tree;

/**
 * Created by viruser on 2018/12/19.
 */

import java.util.Arrays;

/**
 * 由前序遍历，中序遍历的结果求原来这棵二叉树,！！！！！！！！！！！！还可以延伸为(中序，后序)，(先序，后序)，过两天实现下
 */
public class ReConstructBinaryTree {
    public TreeNode solution(int[] pre,int[] in){
        if(pre.length==0||in.length==0){
            return null;
        }
        //前序的开头节点肯定是根节点
        TreeNode node=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){
                node.left=solution(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                node.right=solution(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}
