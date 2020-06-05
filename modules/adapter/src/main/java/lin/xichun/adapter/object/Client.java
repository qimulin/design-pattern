package lin.xichun.adapter.object;

/**
 * 在对象适配器模式中，适配器类继承了目标抽象类并定义了一个适配者类的对象实例，
 * 在所继承的目标抽象类方法中调用适配者类的相应业务方法。
 *
 * Created by Lin.XiChun on 2018/10/22.
 *
 * 对象适配器模式-将具体的对象作为适配器，并设置成自己的属性，就可以调用其适用方法
 * 比喻自解：
 * Target：定义可以沟通的的行为request
 * Adaptee：通用语，specificRequest普通话
 * Adapter：缺乏通用语（属性adaptee）设置的温州人（目前只会说温州话）
 * Adapter2：缺乏通用语（属性adaptee）设置的杭州人（目前只会说杭州话）
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        Target tar = new Adapter(adaptee);
        tar.request();

        Target tar2 = new Adapter2(adaptee);
        tar.request();
    }

}
