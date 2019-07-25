package OverMedium;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/25 17:03
 */
public class Permutation {
    /**
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
     * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     * 输入描述:
     * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
     * @param str
     * @return
     */
    private ArrayList<String> list=new ArrayList<>();
    public ArrayList<String> permutation(String str) {
        if(str.length()==0|| str.length()>9){
            return list;
        }

    }
    private ArrayList<String> generate(String str){

    }
}
