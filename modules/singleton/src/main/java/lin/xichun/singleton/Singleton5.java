package lin.xichun.singleton;

/**
 登记式/静态内部类
 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。
 是否多线程安全：是
 优点：资源利用率高，不执行getInstance()不被实例，可以执行该类其他静态方法。
 缺点 ：第一次加载时反应不够快
 Created by Lin.XiChun on 2018/10/17.
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5 (){}
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
