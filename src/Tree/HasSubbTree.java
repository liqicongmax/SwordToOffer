package Tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 11:05
 */
public class HasSubbTree {
    /**
     * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     *  TODO
     * @param root1
     * @param root2
     * @return
     */
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.value == root2.value) {//如果找到了第一个相同的节点,即起始节点,开始往后遍历,递归验证是否包含
                result = doesTree1HasTree2(root1, root2);
            }
            if (!result) {
                result = hasSubtree(root1.left, root2);//往左找节点
            }
            if (!result) {
                result = hasSubtree(root1.right, root2);//往右找节点
            }
        }
        return result;
    }

    /**
     * 递归检查后续的节点是否包含
     * @param root1
     * @param root2
     * @return
     */
    private boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
        //如果root1先遍历完,而root2没有遍历完,说明root2要比root1大,false
        if (root1 == null && root2 != null) {
            return false;
        }
        if (root2 == null) {//如果root2先遍历完了且没returnfalse,则直接return true
            return true;
        }
        if (root1.value != root2.value) {//如果节点值不相同,肯定return false
            return false;
        }
        //遍历之后的所有节点
        return doesTree1HasTree2(root1.left, root2.left) && doesTree1HasTree2(root1.right, root2.right);
    }
}
