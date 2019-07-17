package 头条算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/17 11:04
 */
public class 字符串复原IP地址 {
    /**
     * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
     * 输入: "25525511135"
     * 输出: ["255.255.11.135", "255.255.111.35"]
     *
     * @param s
     * @return
     */
    static List<String> result = new ArrayList<>();

    public static List<String> restoreIpAddresses(String s) {
        result = new ArrayList<>();
        if (s.length() == 0) {
            return result;
        }
        generateIpAddress("", s);
        return result;
    }

    private static void generateIpAddress(String ipAddress, String s) {
        int n = 0;//n计算点.的个数
        for (int i = 0; i < ipAddress.length(); i++) {
            if (ipAddress.charAt(i) == '.') {
                n++;
            }
        }
        if (n == 3) {//如果已经取完了3部分的值,那么只要考虑最后一部分
            String lastAddress = s.substring(ipAddress.length() - 3);
            if (ipAddress.length() - 3 < s.length()) {
                if (lastAddress.length() > 3) {//如果长度超过4,不行
                    return;
                } else if (lastAddress.length() != 1 && lastAddress.charAt(0) == '0') {//如果长度超过1而且以0开头,不行
                    return;
                } else if (Integer.valueOf(lastAddress) >= 0 && Integer.valueOf(lastAddress) <= 255) {//满足0~255的才可
                    result.add(ipAddress + lastAddress);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        String[] nextAddress = new String[3];
        for (int i = 0; i < 3; i++) {
            if (ipAddress.length() - n + i + 1 <= s.length()) {
                nextAddress[i] = s.substring(ipAddress.length() - n, ipAddress.length() - n + i + 1);
                if (nextAddress[i].length() != 1 && nextAddress[i].charAt(0) == '0') {
                    continue;
                }
                if (Integer.valueOf(nextAddress[i]) >= 0 && Integer.valueOf(nextAddress[i]) <= 255) {
                    generateIpAddress(ipAddress + nextAddress[i] + ".", s);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("0279245587303").size());
    }
}
