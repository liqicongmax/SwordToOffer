package suibianxiexie;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/25 8:59
 */
public class CountTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 2;
    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected Integer compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= THRESHOLD;
        if(canCompute){
            for(int i=start;i<=end;i++){
                sum+=i;
            }
        }else {
            //如果任务个数大于阈值,就分裂成两个子任务进行计算
            int middle=(start+end)/2;
            CountTask leftTask=new CountTask(start,middle);
            CountTask righrTask=new CountTask(middle+1,end);
            leftTask.fork();
            righrTask.fork();
            int leftResult=leftTask.join();
            int rightResult=righrTask.join();
            sum=leftResult+rightResult;
        }
        return sum;
    }
    public static void main(String[] args){
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        CountTask task=new CountTask(1,4);
        Future<Integer> result=forkJoinPool.submit(task);
        try{
            System.out.println(result.get());
        }catch (InterruptedException e){

        }catch (ExecutionException e){

        }
    }
}
