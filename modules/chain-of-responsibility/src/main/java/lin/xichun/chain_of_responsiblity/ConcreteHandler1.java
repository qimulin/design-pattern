package lin.xichun.chain_of_responsiblity;

/**
 * 具体处理者角色
 * Created by Lin.XiChun on 2018/11/19.
 */
public class ConcreteHandler1 extends Handler {
    /**
     * 请求处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest(String param) {
        // 是否有下级链条
        boolean isTrue = this.successor == null ? true : false;
        /*
         * 如果满足条件，则处理；如果没不满足，则转发请求请求
         */
        if (isTrue) {
            System.out.println(this.getClass().getSimpleName() + "处理请求，参数为："+param);
        } else {
            System.out.println(this.getClass().getSimpleName() + "转发请求");
            this.successor.handleRequest(param); // 转发请求
        }
    }
}
