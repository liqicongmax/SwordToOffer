package suibianxiexie;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/9 14:23
 */
public class Stringgg {
    public static void main(String[] args){
        String s1="111";
        String s2="111";
        String s3=""+s2;
        String s4=new String("111");
        String s5=new String("111");
        System.out.println(s1==s2);//s1生成时,字符串常量池出现了一个111,生成的s2也是获取的相同引用
        System.out.println(s1==s3);//先从内存中找s2对应地址信息,然后用StringBuilder拼接起来,最后获得的对象地址显然跟s1不同
        System.out.println(s4==s5);//new生成了两个新对象,显然不同
        System.out.println(s1==s5);//s1所在的指向字符串常量池,而s5是个对象,指向的在堆中
    }
}
