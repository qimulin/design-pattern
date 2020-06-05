package lin.xichun.decorator;

/**
 * Created by Lin.XiChun on 2018/10/24.
 * Component 抽象构件 构件抽象
 * Decorator 抽象装饰类 抽象装饰（只能按我定的范围和规则去装饰），抽象构件类嵌入到该类中
 * ConcreteDecorator 具体装饰类，进行具体的装饰行为
 * ConcreteComponent 具体构件
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        component.operation();
        System.out.println("-----------------------------------");
        decorator.operation();
    }
}
