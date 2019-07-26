package OverMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/26 16:13
 */
public class ReverseSentence {
    /**
     * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
     * 正确的句子应该是“I am a student.”。
     * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
     * @param str
     * @return
     */
    public static String reverseSentence(String str) {
        if(("").equals(str.trim())){
            return " ";
        }
        String[] strs=str.split(" ");
        ArrayList<String> list=new ArrayList<>();
        list= Stream.of(strs).collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(list);
        String s="";
        for(String temp:list){
            s=s+temp+" ";
        }
        return s.substring(0,s.length()-1);
    }
    public static void main(String[] args){
        System.out.println("   ".length());
        System.out.println(reverseSentence(" "));
    }
}
