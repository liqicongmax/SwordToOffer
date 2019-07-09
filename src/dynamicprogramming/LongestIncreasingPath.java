package dynamicprogramming;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/8 9:47
 */
public class LongestIncreasingPath {
    private int[] row={-1,1,0,0};
    private int[] col={0,0,-1,1};
    public static void main(String[] args){
        int[][] arr={{9,9,4},{6,6,8},{2,1,1}};
        System.out.println(new LongestIncreasingPath().longestIncreasingPath(arr));
    }
    public int longestIncreasingPath(int[][] matrix){
        if(matrix.length==0||matrix[0].length==0){
            return 0;
        }
        boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        int[][] len=new int[matrix.length][matrix[0].length];
        int max=0;
        //遍历所有的增长路径长度
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max=Math.max(max,find(matrix,visited,len,i,j));
            }
        }
        return max;
    }

    /**
     * 查找从x,y点出发的最长增长路径长度
     * @param matrix
     * @param visited
     * @param len
     * @param x
     * @param y
     * @return
     */
    public int find(int[][] matrix,boolean[][] visited,int[][] len,int x,int y){
        if(visited[x][y]){
            return len[x][y];
        }
        len[x][y]=1;
        for(int i=0;i<4;i++){
            int curx=x+row[i];
            int cury=y+col[i];
            if(curx>=0&&curx<matrix.length&&cury>=0&&cury<matrix[0].length&&matrix[curx][cury]<matrix[x][y]){
                len[x][y]=Math.max(len[x][y],find(matrix,visited,len,curx,cury)+1);
            }
        }
        visited[x][y]=true;
        return len[x][y];
    }
}
