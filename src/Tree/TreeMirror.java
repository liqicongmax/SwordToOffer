package Tree;

/**
 * Created by viruser on 2018/12/26.
 */

/**
 * 树的镜像
 */
public class TreeMirror {
    public static void solution(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        //把一棵二叉树分为根，左，右三个节点来看，先把头结点下面的两个左右节点换位，然后递归把左右节点下面各自内部的二叉树也做
        //镜像对称
        solution(root.left);
        solution(root.right);
    }
}
