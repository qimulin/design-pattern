package lin.xichun.proxy;

/**
 * 抽象主题角色
 抽象类
 真实主题和代理主题的抽象父类。所以在任何使用真实主题的地方都可以使用代理主题，客户端通常需要针对抽象主题角色进行编程
 * Created by Lin.XiChun on 2018/10/25.
 */
public abstract class Subject {
    public abstract void request();
}