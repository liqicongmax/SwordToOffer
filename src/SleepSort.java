public class SleepSort {
    //睡眠排序，就是把数组里的每个元素都分配一个线程，让它sleep那么多秒，谁先输出的谁就小
    //xiu666
    public static void main(String[] args){
        int[] arr=new int[]{3,7,4,5,1};
        for(int i=0;i<arr.length;i++){
            int temp=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(arr[temp]*1000);
                        System.out.println(arr[temp]);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
