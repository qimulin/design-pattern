package lin.xichun.flyweight;

import java.util.HashMap;

/**
 * 享元工厂类
 具体类
 享元工厂类用于创建并管理享元对象。
 针对抽象享元类编程，将各种类型的具体享元对象存储在一个享元池中，享元池一般设计为一个存储“键值对”的集合（也可以是其他类型的集合。
 当用户请求一个具体享元对象时，享元工厂提供一个存储在享元池中已创建的实例或者创建一个新的实例（如果不存在的话），返回新创建的实例并将其存储在享元池中。
 * Created by Lin.XiChun on 2018/10/25.
 */
public class FlyweightFactory {
    // 定义一个HashMap用于存储享元对象，实现享元池
    private HashMap flyweights = new HashMap();

    public Flyweight getFlyweight(String key) {
        // 如果对象存在，则直接从享元池获取
        if (flyweights.containsKey(key)) {
            return (Flyweight) flyweights.get(key);
        }
        // 如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        else {
            Flyweight fw = new ConcreteFlyweight(key);
            flyweights.put(key, fw);
            return fw;
        }
    }

}
