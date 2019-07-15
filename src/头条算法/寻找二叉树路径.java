package 头条算法;

import 树.TreeNode;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 9:58
 */
public class 寻找二叉树路径 {
    /**
     * 给一棵二叉树以及数字n，判断是否存在从根节点开始的二叉树的路径和为n
     * @param root 二叉树
     * @param n 路径和
     * @return
     */
    public boolean findRoute(TreeNode root,int n){
        if(root.value>n){
            return false;
        }
        if(root.left==null&&root.right==null&& root.value==n){
            return true;
        }
        return findRoute(root.left,n-root.value)||findRoute(root.right,n-root.value);

    }
}
