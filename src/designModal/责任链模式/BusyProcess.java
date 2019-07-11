package designModal.责任链模式;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/11 10:21
 */
public class BusyProcess extends ProcessingObject<String> {
    @Override
    protected String execute(String username, String productName, int count) {
        return "username="+username;
    }
}
