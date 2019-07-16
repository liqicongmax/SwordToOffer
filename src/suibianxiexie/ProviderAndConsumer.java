package suibianxiexie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/16 10:57
 */
public class ProviderAndConsumer {
    private static final int MAX_SIZE=10;
    private static volatile List<Object> list=new ArrayList<>();

    private void produce(){
        synchronized (this){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            while (list.size()==MAX_SIZE){
                System.out.println("仓库已满...");
                try {
                    this.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            System.out.println("producer生产了一个商品,仓库剩余为"+list.size());
            this.notifyAll();
        }
    }

    private void comsumer(){
        synchronized (this){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            while (list.size()==0){
                System.out.println("仓库无商品,暂时无法消费...");
                try {
                    this.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.remove(0);
            System.out.println("consumer消费了一个商品,仓库剩余为:"+list.size());
            this.notifyAll();
        }
    }
    public static void main(String[] args){
        ProviderAndConsumer p=new ProviderAndConsumer();
        for(int i=0;i<10;i++){
            new Thread(()->{
                p.produce();
            }).start();
            new Thread(()->{
                p.comsumer();
            }).start();
        }
//        for(int i=0;i<7;i++){
//
//        }
    }
}
