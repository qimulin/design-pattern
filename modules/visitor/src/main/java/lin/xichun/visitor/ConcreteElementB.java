package lin.xichun.visitor;

/**
 * 具体元素
 * Created by Lin.XiChun on 2018/11/27.
 * 每个ConcreteElement类实现一个Accept操作，这个操作调用访问这种对应于本ConcreteElement类的Visit操作。
 * 操作不仅依赖于元素的类也依赖于访问者的类。
 */
public class ConcreteElementB extends Element {
    public void doSomething() {
        System.out.println("这是元素B");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

}
