package lin.xichun.chain_of_responsiblity;

/**
 * Created by Lin.XiChun on 2018/11/19.
 * 自解：抽象处理角色中自己定义自己，然后设置具体处理实现，形成链，然后代码中做处理。
 * 这样当第一点处理不了，可以转发给第二点处理，甚至可以一层一层处理下去
 */
public class Client {
    public static void main(String[] args) {
        // 组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        // 提交请求
        System.out.println("---------- 情况1：参数为空 ------------");
        handler1.handleRequest(null);
        System.out.println("---------- 情况1：参数不为空 -----------");
        handler1.handleRequest("11");
    }
}
