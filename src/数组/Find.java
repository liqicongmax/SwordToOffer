package 数组;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/15 17:20
 */
public class Find {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param target
     * @param arr
     * @return
     */
    public static boolean find(int target,int[][] arr){
       int row=arr.length;
       int col=arr[0].length;
       boolean flag=false;
        if(target==arr[arr.length-1][arr.length-1]){
            flag=true;
        }else if(target<arr[row-1][col-1]){
           while(target<=arr[row-1][col-1]&&row>1){
               row--;
           }
           int lastrow=row;
           if(arr[0][col-1]>target){
               lastrow=0;
           }
           while(target<=arr[arr.length-1][col-1]&&col>1){
               col--;
           }
           int lastcol=col;
           if(arr[arr.length-1][0]>target){
               lastcol=0;
           }
           for(int i=lastrow;i<arr.length;i++){
               for(int j=lastcol;j<arr.length;j++){
                   if(arr[i][j]==target){
                       flag=true;
                   }
               }
           }
       }else {
           flag=false;
       }

       return flag;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//        int[][] arr={{1,2,8,9},{4,7,10,13}};
        System.out.println(find(15,arr));
    }
}
