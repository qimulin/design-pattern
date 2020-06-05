package lin.xichun.chain_of_responsiblity;

/**
 * 具体处理者角色
 * Created by Lin.XiChun on 2018/11/19.
 */
public class ConcreteHandler extends Handler {
    /**
     * 请求处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest(String judging) {
        // 判断请求是否满足条件，这里随便设置个条件
        boolean isTrue = judging == null ? true : false;
        /*
         * 如果满足条件，则处理；如果没不满足，则转发请求请求
         */
        if (isTrue) {
            System.out.println(this.getClass().getSimpleName() + "处理请求");
        } else {
            System.out.println(this.getClass().getSimpleName() + "转发请求");
            this.successor.handleRequest(judging); // 转发请求
        }
    }
}
