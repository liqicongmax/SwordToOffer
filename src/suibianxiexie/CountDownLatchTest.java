package suibianxiexie;

import java.util.concurrent.CountDownLatch;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/25 10:50
 */
public class CountDownLatchTest {
    private static CountDownLatch latch=new CountDownLatch(2);
    public static void main(String[] args)throws InterruptedException{
        new Thread(()->{
            System.out.println("woshidiyige");
            latch.countDown();
        }).start();
        new Thread(()->{
            latch.countDown();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("我是第二个");
        }).start();
        latch.await();
        System.out.println("finished");

    }
}
