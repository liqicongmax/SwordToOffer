package OverMedium;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 16:40
 */
public class MovingCount {
    /**
     * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
     * 请问该机器人能够达到多少个格子？
     * @param threshold
     * @param rows
     * @param cols
     * @return
     * TODO
     */
    public int movingCount(int threshold, int rows, int cols) {
        if(threshold<0||rows<0||cols<0){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int[][] position={{0,1,0,-1},{1,0,-1,0}};
        boolean[] checked=new boolean[rows*cols];
        stack.push(0);
        checked[0]=true;
        int count=0;
        while(!stack.isEmpty()){
            int now=stack.pop();
            count++;
            for(int i=0;i<4;i++){
                int x=now%cols+position[0][i];
                int y=now/cols+position[1][i];
                int sum=sum(x)+sum(y);
                if(x>=0&&x<cols&&y>=0&&y<rows&&sum<=threshold&&!checked[x+y*cols]){
                    stack.push(x+y*cols);
                    checked[x+y*cols]=true;
                }
            }
        }

        return count;
    }
    private int sum(int x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
}
