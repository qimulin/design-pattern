package lin.xichun.state;

/**
 * 具体状态类
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        System.out.println("我要做B操作");
    }
}
