package OverMedium;

import java.util.ArrayList;

/**
 * @Author liqicong
 * @Date 2019/7/23 22:44
 * @Description
 */
public class GetUglyNumber {
    /**
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     * @param index
     * @return
     */
    public int GetUglyNumber_Solution(int index) {
        if(index==0){
            return 0;
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int t2=0,t3=0,t5=0;
        while(list.size()<index) {
            int s2 = list.get(t2) * 2;
            int s3 = list.get(t3) * 3;
            int s5 = list.get(t5) * 5;
            int min = Math.min(s2, Math.min(s3, s5));
            list.add(min);
            if(min==s2)t2++;
            if(min==s3)t3++;
            if(min==s5)t5++;
        }
        return list.get(list.size()-1);
    }
}
