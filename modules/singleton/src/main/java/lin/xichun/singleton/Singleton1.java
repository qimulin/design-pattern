package lin.xichun.singleton;

/**
 * 懒汉式-线程不安全
 * 描述：这种实现最大的问题就是不支持多线程，所以严格意义上它并不算单例模式。
 * 优点：避免了饿汉式的那种在没有用到的情况下创建事例，资源利用率高，不执行getInstance()就不会被实例，可以执行该类的其他静态方法。
 * 缺点：不支持多线程
 * 【注意】：多执行几次确实会发现不止创建一个实例
 * Created by Lin.XiChun on 2018/10/16.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

