package Tree;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/5 15:46
 */
public class TreeCheck {
    public static void main(String[] args){

    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return maxDepth(root)!=-1;
    }

    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        if(left==0){
            return -1;
        }
        int right=maxDepth(root.right);
        if(right==0){
            return -1;
        }
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
}
