package lin.xichun.state;

/**
 * 抽象状态类
 * Created by Lin.XiChun on 2018/11/23.
 */
public abstract class State {
    // 声明抽象业务方法，不同的具体状态类可以不同的实现
    public abstract void handle(Context context);
}
