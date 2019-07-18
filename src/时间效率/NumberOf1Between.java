package 时间效率;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 16:39
 */
public class NumberOf1Between {
    /**
     * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
     * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
     * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
     * @param n n
     * @return n
     */
    public static int numberOf1Between(int n){
        int count=0;
        for(int i=1;i<n+1;i++){
            count+=count1OfInt(i);
        }
        return count;
    }

    private static int count1OfInt(int n){
        String s=String.valueOf(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    /**
     * 牛逼的O(logn)复杂度
     * TODO
     * @param n
     * @return
     */
    public static int numberOf1Between1And(int n){
        if(n<1){
            return 0;
        }
        int count=0;
        int base=1;
        int round=n;
        while(round>0){
            int weight=round%10;
            round/=10;
            count+=round*base;
            if(weight==1){
                count+=(round%base)+1;
            }else if(weight>1){
                count+=base;
            }
            base*=10;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(numberOf1Between1And(2534));
    }
}
