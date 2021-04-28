package lin.xichun.decorator;

/**
 * 装饰器通常是将主体设置进来，然后对他进行操作
 * Created by Lin.XiChun on 2018/10/24.
 */
public abstract class Decorator extends Component {
    private Component component; // 维持一个对抽象构件对象的引用

    public Decorator(Component component) // 注入一个抽象构件类型的对象
    {
        this.component = component;
    }

    public void operation() {
        component.operation(); // 调用原有业务方法
    }
}
