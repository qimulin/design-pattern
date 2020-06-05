package lin.xichun.singleton;

/**
 * 饿汉式
 * 描述：支持多线程，这种方式比较常用，但容易产生垃圾对象。
 * 是否多线程安全：是
 * 优点：没有加锁，执行效率会提高。在类加载的同时已经创建好一个静态对象，调用时反应速度快 。
 * 缺点：类加载时就初始化，浪费内存。
 * Created by Lin.XiChun on 2018/10/16.
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance() {
        return instance;
    }
}
