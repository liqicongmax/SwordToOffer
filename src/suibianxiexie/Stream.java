package suibianxiexie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/3 16:24
 */
public class Stream {
    public static void main(String[] args){
        List<String> myList= Arrays.asList("1a","1b","1c","1d","1e");
        myList.stream().filter(s -> s.startsWith("1")).map(String::toUpperCase).sorted().forEach(System.out::println);
        java.util.stream.Stream<String> stringStream;
        HashMap<String,String> map=new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.keySet().stream().filter(i->!map.get(i).equals("")).forEach(System.out::println);
        IntStream.of(1,3,2,5).sorted().forEach(System.out::print);
    }
}
