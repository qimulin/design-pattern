package lin.xichun.state;

/**
 * 具体状态类
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        System.out.println("我要做A操作");
    }
}
