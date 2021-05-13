package lin.xichun.decorator;

/**
 * 具体装饰类
 * 负责向构件添加新的职责。
 * 每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。
 * Created by Lin.XiChun on 2018/10/24.
 */
public class ConcreteDecorator extends Decorator {

    /**
     * 相当于给Component添加了装饰
     * */
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation(); // 调用原有业务方法
        addedBehavior(); // 调用新增业务方法
    }

    // 新增业务方法
    public void addedBehavior() {
        System.out.println("ConcreteDecorator.addedBehavior()");
    }
}
