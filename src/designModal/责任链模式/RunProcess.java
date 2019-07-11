package designModal.责任链模式;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/11 10:23
 */
public class RunProcess {
    public static void main(String[] args){
        BusyProcess busyProcess=new BusyProcess();
        FreeProcess freeProcess=new FreeProcess();
        busyProcess.setNextProcess(freeProcess);
        System.out.println(busyProcess.handler("xiaoming","pingguo",123));
    }
}
