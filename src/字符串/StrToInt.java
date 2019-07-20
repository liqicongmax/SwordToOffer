package 字符串;

/**
 * @Author liqicong
 * @Date 2019/7/20 16:39
 * @Description
 */
public class StrToInt {
    /**
     * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)。
     * 数值为0或者字符串不是一个合法的数值则返回0。
     * 没啥意义，主要靠边界处理，平时注意即可，面试题一般不会考这种
     * @param str
     * @return
     */
    public int strToInt(String str) {
        if (!checkStr(str) || "0".equals(str)) {
            return 0;
        }
        String symbol="";
        if (str.charAt(0)==43){
            symbol="+";
        }
        if(str.charAt(0)==45){
            symbol="-";
        }

        return 0;
    }

    private boolean checkStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == 43 && i == 0) {
                continue;
            }
            if (s == 45 && i == 0) {
                continue;
            }
            if ((s >= 48 && s <= 57)) {
                continue;
            }
            return false;
        }

        return true;
    }
}
