package lin.xichun.flyweight;

/**
 * 抽象享元类
 接口或抽象类
 声明了具体享元类公共的方法。
 提供享元对象的内部数据、设置外部数据
 * Created by Lin.XiChun on 2018/10/25.
 */
public interface Flyweight {
    void operation(String extrinsicState);
}
