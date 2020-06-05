package lin.xichun.singleton;

/**
 双检锁/双重校验锁（DCL，即 double-checked locking）
 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。getInstance() 的性能对应用程序很关键。
 是否多线程安全：是
 优点 ：资源利用率高，不执行getInstance()就不被实例，可以执行该类其他静态方法
 缺点 ：第一次加载时反应不快，由于java内存模型一些原因偶尔失败
 */
public class Singleton4 {

    private volatile static Singleton4 singleton;
    private Singleton4 (){}
    public static Singleton4 getInstance() {
        // 和懒汉式-线程安全相比，不是直接作用在getInstance方法中，所以提升了getInstance的性能
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
