package 字符串;

/**
 * Created by viruser on 2018/12/19.
 */
/**
 * 将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public String solution(StringBuffer str){
        String s=str.toString();
        return s.replace(" ","%20");
        //return s;
    }
}
