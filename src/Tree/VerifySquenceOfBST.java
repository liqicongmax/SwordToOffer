package Tree;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    public static boolean solution(int[] sequence){
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        //root是二叉排序树的根节点
        int root=sequence[sequence.length-1];
        int rootsite=0;
        int[] left=new int[]{};
        int[] right=new int[]{};
        for(int i=0;i<sequence.length-1;i++){
            if(sequence[i]<root) {
                left[i] = sequence[i];
            }else {
                rootsite=i;
                break;
            }
        }
        if(rootsite>sequence.length-1){
            return false;
        }
        for(int i=rootsite;i<sequence.length-1;i++){
            if(sequence[i]<root){
                return false;
            }
            right[i-rootsite]=sequence[i];
        }
        solution(left);
        solution(right);
        return true;
    }

}
