package lin.xichun.flyweight;

/**
 * 具体享元类
 具体类
 继承或实现了抽象享元类。
 其实例称为享元对象。
 * Created by Lin.XiChun on 2018/10/25.
 */
public class ConcreteFlyweight implements Flyweight {
    // 内部状态intrinsicState作为成员变量，同一个享元对象其内部状态是一致的
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    // 外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象，在每一次调用时也可以传入不同的外部状态
    @Override
    public void operation(String extrinsicState) {

    }
}
