package suibianxiexie;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 通过AtomicStampedRefernce解决CAS中的ABA问题
 * @author liqicong@myhexin.com
 * @date 2019/7/3 14:32
 */
public class CASinABA {
    private static AtomicInteger atomicInteger=new AtomicInteger(100);
    private static AtomicStampedReference<Integer> atomicStampedReference=new AtomicStampedReference<>(100,0);
    public static void main(String[] args)throws InterruptedException{
        Thread t1=new Thread(()->{
            atomicInteger.compareAndSet(100,101);
            atomicInteger.compareAndSet(101,100);
        });
        Thread t2=new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            boolean s1=atomicInteger.compareAndSet(100,101);
            System.out.println("t="+s1);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        Thread r1=new Thread(()->{
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            atomicStampedReference.compareAndSet(100,101,atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);
            atomicStampedReference.compareAndSet(101,100,atomicStampedReference.getStamp(),atomicStampedReference.getStamp()+1);
        });

        Thread r2=new Thread(()->{
            int stamp = atomicStampedReference.getStamp();
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            boolean s2=atomicStampedReference.compareAndSet(100,101,stamp,stamp+1);
            System.out.println("s2="+s2);
        });
        r1.start();
        r2.start();
    }
}
