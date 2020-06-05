package lin.xichun.listener;

/**
 监听器模式有三个要素——事件源、事件对象、监听器。
 事件源：顾名思义，事件发生的源头，比如点击的按钮，属于被监听的对象；
 事件对象：这个经常和事件源混淆，它经常被用来包装事件源，切记，它毕竟是个事件，比如点击事件，和事件源的区别自己感受，木有栗子；
 监听器：这个是监听器模式的核心，定义事件发生后的动作，通常事件对象作为监听器中定义的函数入参。

 下面举个简单的栗子：
 故事背景是，小明是个不讲卫生的孩子，他妈妈很担心他的健康，规定必须饭前洗手。
 Created by Lin.XiChun on 2019-01-03.
 */
public class Client {
    public static void main(String[] args) {
        Child zs = new Child("张三");
        zs.addListener(new RemindListener());
        zs.eat();
    }
}
