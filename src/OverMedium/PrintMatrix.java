package OverMedium;

import java.util.ArrayList;

/**
 * Created by viruser on 2018/12/26.
 */

/**
 *
 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
    /**
     * todo
     * @param matrix
     * @return
     */
    static ArrayList<Integer> res=new ArrayList<>();
    public static ArrayList<Integer> solution(int[][] matrix){
        int row = matrix.length;
        if(row==0)
            return null;
        int col = matrix[0].length;
        if(col==0)
            return null;
        ArrayList<Integer> list = new ArrayList<Integer>();

        int startRow = 0;
        int endRow = row-1;
        int startCol = 0;
        int endCol = col-1;
        while(startRow<=endRow&&startCol<=endCol){
            //如果就剩下一行
            if(startRow==endRow){
                for(int i=startCol;i<=endCol;i++)
                    list.add(matrix[startRow][i]);
                return list;
            }
            //如果就剩下一列
            if(startCol==endCol){
                for(int i=startRow;i<=endRow;i++)
                    list.add(matrix[i][startCol]);
                return list;
            }
            //首行
            for(int i=startCol;i<=endCol;i++)
                list.add(matrix[startRow][i]);
            //末列
            for(int i=startRow+1;i<=endRow;i++)
                list.add(matrix[i][endCol]);
            //末行
            for(int i=endCol-1;i>=startCol;i--)
                list.add(matrix[endRow][i]);
            //首列
            for(int i=endRow-1;i>=startRow+1;i--)
                list.add(matrix[i][startCol]);

            startRow = startRow + 1;
            endRow = endRow - 1;
            startCol = startCol + 1;
            endCol = endCol - 1;
        }
        return list;

    }
    public static ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> list=new ArrayList<>();
        int row=matrix.length;
        if(row==0){
            return list;
        }
        int col=matrix[0].length;
        int rowStart=0;
        int rowEnd=row-1;
        int colStart=0;
        int colEnd=col-1;
        while(rowStart<=rowEnd&&colStart<=colEnd){
            if(rowStart==rowEnd){//如果是竖的单条
                for(int i=colStart;i<=colEnd;i++) {
                    list.add(matrix[rowStart][i]);
                }
                return list;
            }
            if(colStart==colEnd){
                for(int i=rowStart;i<=rowEnd;i++){
                    list.add(matrix[i][colStart]);
                }
                return list;
            }
            for(int i=colStart;i<=colEnd;i++){
                list.add(matrix[rowStart][i]);
            }
            for(int i=rowStart+1;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            for(int i=colEnd-1;i>=colStart;i--){
                list.add(matrix[rowEnd][i]);
            }
            for(int i=rowEnd-1;i>=rowStart+1;i--){
                list.add(matrix[i][colStart]);
            }
            colEnd--;
            rowEnd--;
            colStart++;
            rowStart++;
        }
        return list;
    }
    public static void main(String[] args){
//        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr={{1,2},{3,4}};
        System.out.println(solution(arr).size());
        System.out.println("____________");
        for(Integer i:printMatrix(arr)){
            System.out.println(i);
        }
    }
    /**
     * 采用递归的思想，每一次都是顺时针打印一圈，然后去掉外面一层，
     * 退出递归的条件就是matrix.length==0了
     * @param matrix
     * @return
     */
    public static ArrayList<Integer> solution1(int[][] matrix){
        if(matrix.length==0){
            return null;
        }
        while(matrix.length!=0){

        }
        return null;
    }
}
