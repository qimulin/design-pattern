package lin.xichun.decorator;

/**
 * 具体构件
 * 实现了在抽象构件中声明的方法，装饰器可以给它增加额外的方法。
 * Created by Lin.XiChun on 2018/10/24.
 */
public class ConcreteComponent extends Component{
    @Override
    void operation() {
        System.out.println("ConcreteComponent.operation()");
    }
}
