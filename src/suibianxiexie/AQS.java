package suibianxiexie;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/17 9:03
 */
public class AQS {
    public static void main(String[] args){
        AbstractQueuedSynchronizer aqs=new AbstractQueuedSynchronizer() {

            @Override
            protected boolean tryAcquire(int arg) {
                return super.tryAcquire(arg);
            }
        };
    }
}
