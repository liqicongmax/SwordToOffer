package leetcode.leetcode93;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liqicong
 * @Date 2019/7/17 19:52
 * @Description
 */
public class RestoreIpAddress {
    private static List<String> list=new ArrayList<>();
    public static List<String> restoreIpAddress(String s){
        if(s.length()==0){
            return list;
        }
        generateAddress("",s);
        return list;
    }
    private static void generateAddress(String ipAddress,String s){
        int n=0;
        for(int i=0;i<ipAddress.length();i++){
            if(ipAddress.charAt(i)=='.'){
                n++;
            }
        }
        if(n==3){
            if(ipAddress.length()-3<s.length()){
                String lastAddress=s.substring(ipAddress.length()-3);
                if(lastAddress.length()>3){
                    return;
                }
                if(lastAddress.length()!=1&&lastAddress.charAt(0)=='0'){
                    return;
                }
                if(Integer.valueOf(lastAddress)>=0&&Integer.valueOf(lastAddress)<=255){
                    list.add(ipAddress+lastAddress);
                }
            }else {
                return;
            }
        }
        String[] nextAddress=new String[3];
        for(int i=0;i<3;i++){
            if(ipAddress.length()-n+i+1<s.length()){
                nextAddress[i]=s.substring(ipAddress.length()-n,ipAddress.length()-n+i+1);
                if(nextAddress[i].length()!=1&&nextAddress[i].charAt(0)=='0'){
                    continue;
                }
                if(Integer.valueOf(nextAddress[i])>=0&&Integer.valueOf(nextAddress[i])<=255){
                    generateAddress(ipAddress+nextAddress[i]+".",s);
                }
            }
        }
    }

    public static void main(String[] args){
        String s="1111";
        System.out.println(restoreIpAddress(s).size());
    }
}
