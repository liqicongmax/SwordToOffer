package 矩阵;

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
    public static ArrayList<Integer> solution(int[][] matrix){
        if(matrix.length==0){
            return null;
        }
        int size=matrix.length*matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>(size);
        //标注4个方向打印的起点
        int top;
        int right;
        int bottom;
        int left;
        return null;
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
