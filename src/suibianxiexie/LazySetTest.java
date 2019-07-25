package suibianxiexie;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/25 9:57
 */
public class LazySetTest {
    private static AtomicInteger i=new AtomicInteger(2);
    public static void main(String[] args){

        new Thread(()->{
            System.out.println(i.get());
        }).start();
        new Thread(()->{
            System.out.println(i.get());
        }).start();
        new Thread(()->{
            System.out.println(i.get());
        }).start();
        new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();new Thread(()->{
            System.out.println(i.get());
        }).start();
        new Thread(()->{
            System.out.println(i.get());
        }).start();


        new Thread(()->{
            i.compareAndSet(2,5);
        }).start();
    }
}
