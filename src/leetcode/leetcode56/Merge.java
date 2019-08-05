package leetcode.leetcode56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/5 20:30
 */
public class Merge {
    /**
     * 给出一个区间的集合，请合并所有重叠的区间。
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 链接：https://leetcode-cn.com/problems/merge-intervals
     * @param intervals 给出的数组列表
     * @return 合并后的数组列表
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        Arrays.sort(intervals);
        for(int i=0;i<intervals.length;i++){
            if(list.isEmpty()||intervals[i][0]>list.get(list.size()-1)[1]){
                list.add(intervals[i]);
            }else{
                int end=Math.max(intervals[i][1],list.get(list.size()-1)[1]);
                list.get(list.size()-1)[1]=end;
            }
        }
        return list.toArray(new int[list.size()][2]);
    }

}
