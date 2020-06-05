package lin.xichun.state;

/**
 * 测试类
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Client {
    public static void main(String[] args) {
        // 客户端靠环境类对状态进行改变
        Context c = new Context();
        ConcreteStateA state = new ConcreteStateA();
        c.setState(state);
        c.request();
        c.changeValue(1);
        c.request();
        c.changeValue(0);
        c.request();

    }
}
