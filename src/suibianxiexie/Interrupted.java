package suibianxiexie;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 8:13
 */
public class Interrupted {
    public static void main(String[] args)throws InterruptedException{
        Thread t1=new Thread(()->{
            while (true){
                System.out.println("t1");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(()->{
            while(true){

            }
        });
        t1.start();
        t2.start();
        t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println(t2.isInterrupted());
        t2.interrupt();
        System.out.println(t2.isInterrupted());
    }
}
