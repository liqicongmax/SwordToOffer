package suibianxiexie;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/4 10:07
 */
public class Demo {
    public static void main(String[] args)throws InterruptedException{
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("我是守护线程"+i);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        //t1.setDaemon(true);
        Thread t2=new Thread(()->{
//            try {
//                Thread.sleep(300);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
            System.out.println("线程结束啦");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        t1.interrupt();
        t2.interrupt();
        System.out.println("t1"+t1.isInterrupted());
        System.out.println("t2"+t1.isInterrupted());
    }
}
