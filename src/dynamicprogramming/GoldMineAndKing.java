package dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/13 10:36
 */
public class GoldMineAndKing {
    private static final HashMap<Integer, Integer> mines = new HashMap<>();
    private static final int[] gold = {500, 200, 300, 350, 400};
    private static final int[] need = {5, 3, 4, 3, 5};

    static {
        mines.put(500, 5);
        mines.put(200, 3);
        mines.put(300, 4);
        mines.put(350, 3);
        mines.put(400, 5);
    }

    /**
     * 有一个国家发现了5座金矿，每座金矿的黄金储量不同，需要参与挖掘的工人数也不同。参与挖矿工人的总数是10人。
     * * 每座金矿要么全挖，要么不挖，不能派出一半人挖取一半金矿。要求用程序求解出，要想得到尽可能多的黄金，应该选择挖取哪几座金矿？
     * * 金矿情况 ()金/()人 500/5 200/3 300/4 350/3 400/5
     * count统计运行次数,初始为0
     *
     * @param minesCount
     * @param remain
     * @return
     */
    public static int getMaxGold(int minesCount, int remain) {

        ArrayList<Integer> mine = new ArrayList<>();//max数组保存金矿信息
        int max = 0;
        if(remain<=0){
            return 0;
        }
        if(minesCount<=0){
            return 0;
        }

        return Math.max(getMaxGold(minesCount - 1, remain), getMaxGold(minesCount - 1, remain - need[5-minesCount]) + gold[5-minesCount]);

    }

    public static void main(String[] args) {
        System.out.println(getMaxGold(5, 10));
    }
}
