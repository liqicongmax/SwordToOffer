package suibianxiexie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/23 7:28
 */
public class TransIp {
    private static List<String> list=new ArrayList<>();
    public static List<String> transIp(String s){
        if(s.length()<4){
            return list;
        }
        generate("",s);
        return list;
    }
    private static void generate(String ipAddress,String s){
        int n=0;
        for(int i=0;i<ipAddress.length();i++){
            if(ipAddress.charAt(i)=='.'){
                n++;
            }
        }
        if(n==3){
            String lastIpAddress=s.substring(ipAddress.length()-3);
            if(ipAddress.length()-3<s.length()){
                if(lastIpAddress.length()>3){
                    return;
                }
                if(lastIpAddress.length()!=1&&lastIpAddress.charAt(0)=='0'){
                    return;
                }
                if(Integer.valueOf(lastIpAddress)>=0&&Integer.valueOf(lastIpAddress)<=255){
                    list.add(ipAddress+lastIpAddress);
                }
            }else {
                return;
            }
        }
        String[] nextAddress=new String[3];
        for(int i=0;i<3;i++){
            if(ipAddress.length()-n+i+1<s.length()) {
                nextAddress[i] = s.substring(ipAddress.length() - n, ipAddress.length() - n + i + 1);
                if(nextAddress[i].length()!=1&&nextAddress[i].charAt(0)=='0'){
                    continue;
                }
                if(Integer.valueOf(nextAddress[i])>=0&&Integer.valueOf(nextAddress[i])<=255){
                    generate(ipAddress+nextAddress[i]+".",s);
                }
            }

        }
    }
}
