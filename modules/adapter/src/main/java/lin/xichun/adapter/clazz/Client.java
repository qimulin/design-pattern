package lin.xichun.adapter.clazz;

/**
 * 在类适配器模式中，适配器类实现了目标抽象类接口并继承了适配者类，
 * 并在目标抽象类的实现方法中调用所继承的适配者类的方法。
 *
 * Created by Lin.XiChun on 2018/10/22.
 *
 * 类适配器模式-将类作为适配器，则所有与其适配的类（继承它）可以使用其适配方法
 * 比喻自解：其实我觉得简单的话Target里的方法可以直接定义在Adaptee中
 * Target：定义可以沟通的的行为request
 * Adaptee：中国人（会说普通话），说普通话specificRequest
 * Adapter：继承了Adaptee的温州人（会说普通话，温州话）
 * Adapter2：继承了Adaptee的杭州人（会说普通话，杭州话）
 * 用适配器之后你们就可以都说普通话了。
 */
public class Client {
    public static void main(String[] args) {
        Target tar = new Adapter();
        tar.request();
        Target tar2 = new Adapter2();
        tar2.request();
    }
}
