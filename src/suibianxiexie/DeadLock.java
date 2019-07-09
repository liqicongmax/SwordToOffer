package suibianxiexie;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/3 8:11
 */
public class DeadLock {
    public static void main(String[] args) {
        deadLock();
    }

    private static String A = "A";
    private static String B = "B";

    public static void deadLock() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (DeadLock.A) {
                    System.out.println("t1占有A了");
                    try {
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (DeadLock.B) {
                        System.out.println("t1正在请求B");
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (DeadLock.B) {
                    System.out.println("t2占有B了");
                    synchronized (DeadLock.A) {
                        System.out.println("t2正在请求A");
                    }
                }
            }
        }).start();
//        t1.start();
//        t2.start();
    }
}
