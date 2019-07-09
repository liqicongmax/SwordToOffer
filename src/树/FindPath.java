package 树;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/6/27 14:02
 */


public class FindPath {
    /**
     * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
     */
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, Integer target) {
        ArrayList<ArrayList<Integer>> listAll=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if (root==null) {
            return listAll;
        }
        list.add(root.value);
        target=target-root.value;
        if(target==0&&root.left==null&&root.right==null){
            listAll.add(new ArrayList<Integer>(list));
        }
        findPath(root.left,target);
        findPath(root.right,target);
        list.remove(list.size()-1);
        return listAll;
    }
}
