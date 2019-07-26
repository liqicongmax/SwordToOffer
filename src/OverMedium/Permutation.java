package OverMedium;

import java.util.ArrayList;
import java.util.Collections;

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
    private static ArrayList<String> list=new ArrayList<>();
    public static ArrayList<String> permutation(String str) {
        if(str.length()==0|| str.length()>9){
            return list;
        }
        generate(str.toCharArray(),0,list);
        Collections.sort(list);
        return list;
    }
    private static void generate(char[] strs,int index,ArrayList<String> result){
        if(index==strs.length-1){
            String str=String.valueOf(strs);
            if(!result.contains(str)){
                result.add(str);
                return;
            }
        }else{
            for(int i=index;i<strs.length;i++){
                swap(strs,i,index);
                generate(strs,index+1,result);
                swap(strs,i,index);//上一步执行到最后return了.
            }
        }
    }
    private static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        ArrayList<String> result=permutation("aa");
        result.forEach(System.out::println);
    }
}
