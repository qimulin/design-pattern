package lin.xichun.singleton;

/**
 枚举
 描述：这种实现方式还没有被广泛采用，但据说这是实现单例模式的最佳方法。这种方式是 Effective Java 作者 Josh Bloch 提倡的方式。
 是否多线程安全：是
 优点：它更简洁，不仅能避免多线程同步问题，而且还自动支持序列化机制。
 缺点：枚举是JDK1.5以后才支持的。
 * Created by Lin.XiChun on 2018/10/17.
 */
class Resource{
}

public enum SingletonEnum{
    INSTANCE;
    private Resource instance;
    SingletonEnum() {
        instance = new Resource();
    }
    public Resource getInstance() {
        return instance;
    }
}