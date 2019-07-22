package leetcode.leetcode386;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/22 13:41
 */
public class LexicalOrder {
    /**
     * 给定一个整数 n, 返回从 1 到 n 的字典顺序。
     * 例如给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。
     * <p>
     * 请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 n 小于等于 5,000,000。
     *
     * @param n 最大数
     * @return
     */
    private static ArrayList<Integer> result = new ArrayList<>();

    public static List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(i);
            list.add(builder.toString());
        }

        Collections.sort(list);

        List<Integer> ans = new ArrayList<>();
        for (String s : list) {
            ans.add(Integer.parseInt(s));
        }

        return ans;
    }

    private static List<Integer> lexicalOrder1(int n) {
        if (n < 0) {
            return result;
        }
        for (int i = 1; i < 10; i++) {
            if (i <= n) {
                result.add(i);
                add(result, n, i);
            } else {
                break;
            }
        }
        return result;
    }

    private static void add(ArrayList<Integer> list, int n, int start) {
        start *= 10;
        for (int i = 0; i < 10; i++,start++) {
            if (start <= n) {
                list.add(start);
                add(list, n, start);
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = lexicalOrder1(100);
        int count = 0;
        for (Integer list1 : list) {
            System.out.print(list1 + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
