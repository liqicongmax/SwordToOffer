package suibianxiexie;

import java.util.concurrent.CyclicBarrier;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/25 10:57
 */
public class CyclicBarrierTest {

    public static void main(String[] args){
        CyclicBarrier barrier=new CyclicBarrier(2);
        new Thread(()->{
            System.out.println("woshidiyige");
            try {
                barrier.await();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("第一个结束啦");
        }).start();
        new Thread(()->{
            try {
                barrier.await();
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("我是第二个");
        }).start();
//        try{barrier.await();}
//        catch (Exception e){
//
//        }
        class C implements Runnable{
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            @Override
            public void run() {
                System.out.println("finished");
            }
        }


    }
}
