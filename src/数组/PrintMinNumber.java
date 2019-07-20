package 数组;

/**
 * @Author liqicong
 * @Date 2019/7/20 15:42
 * @Description
 */
public class PrintMinNumber {
    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     * 数组{a,b,c},如果ab>ba，那么a和b换位
     * 改变传统的排序方式
     * @param numbers
     * @return
     */
    public String PrintMinNumber(int [] numbers) {
        String result="";
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a=Integer.parseInt(numbers[i]+""+numbers[j]);
                int b=Integer.parseInt(numbers[j]+""+numbers[i]);
                if(a>b){
                    int t=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=t;
                }
            }
        }
        for(int i:numbers){
            result+=i;
        }
        return result;
    }
}
