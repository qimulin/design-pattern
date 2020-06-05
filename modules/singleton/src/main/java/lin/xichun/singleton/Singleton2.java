package lin.xichun.singleton;

/**
 * 懒汉式-线程安全
 * 描述：支持多线程，但效率低
 * 是否多线程安全：是
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率
 * Created by Lin.XiChun on 2018/10/16.
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance() {
        // 和懒汉式线程不安全比的话，只是多了synchronized的关键词来保证线程安全
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
