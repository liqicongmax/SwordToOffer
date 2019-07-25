package Tree;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by viruser on 2018/12/19.
 */
public class TreeNode implements Delayed {
    public TreeNode left;
    public TreeNode right;
    public int value;
    TreeNode(){

    }
    TreeNode(int x){
        this.value=x;
    }


    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }


    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
