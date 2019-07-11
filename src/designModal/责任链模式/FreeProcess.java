package designModal.责任链模式;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/11 10:22
 */
public class FreeProcess extends ProcessingObject<String> {
    @Override
    protected String execute(String username, String productName, int count) {
        return "productName="+productName;
    }
}
