package Tree;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/2 18:48
 */
public class Symmetrical {
    /**
     * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     */
    public static void main(String... args) {

    }

    boolean isSymmetrical(TreeNode root) {
        if(root==null){
            return true;
        }
        return check(root.left,root.right);
    }
    boolean check(TreeNode node1,TreeNode node2){
        if(node1==null) {return node2==null;}
        if(node2==null){
            return false;
        }
        if(node1.value!=node2.value){
            return false;
        }
        return check(node1.left,node2.right)&&check(node1.right,node2.left);
    }

}
