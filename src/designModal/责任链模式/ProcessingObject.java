package designModal.责任链模式;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/11 10:16
 */
public abstract class ProcessingObject<T> {
    protected ProcessingObject<T> nextProcess;

    public void setNextProcess(ProcessingObject<T> process) {
        this.nextProcess = process;
    }

    public String handler(String username, String productName, int count) {
        String temp=execute(username, productName, count);
        if(nextProcess!=null) {
            return temp + nextProcess.handler(username, productName, count);
        }
        return temp;
    }

    //    abstract protected T handleWord(T input);
    abstract protected String execute(String username, String productName, int count);
}
