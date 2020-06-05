package lin.xichun.singleton;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Lin.XiChun on 2018/10/16.
 *
 什么时候使用单例模式？
 对于一个类来说，如果创建了两个对象或更多对象，程序会出错。
 需要频繁实例化然后销毁的对象。
 创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
 有状态的工具类对象。
 频繁访问数据库或文件的对象。

 什么是单例模式？
 单例模式(Singleton Pattern)：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，
 它提供全局访问的方法。

 要点：
 只能有一个实例。
 必须自己创建自己的唯一实例。
 必须给整个系统提供这一实例。

 从具体实现角度来说，就是以下三点：
 单例模式的类只提供私有的构造函数。
 类定义中含有一个该类的静态私有对象。
 该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象。
 */
public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {

        final Set<String> set = Collections.synchronizedSet(new HashSet<String>());
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Singleton1 singleton = Singleton1.getInstance();
//                    Singleton2 singleton = Singleton2.getInstance();
                    set.add(singleton.toString());
                }
            });
        }
        Thread.sleep(1000);
        System.out.println("一共创建了" + set.size() + "个实例");
        for (String str : set) {
            System.out.println(str);
        }
        executor.shutdown();
    }

}
