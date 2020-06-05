package lin.xichun.flyweight;

/**
 * 非共享具体享元类
 具体类
 继承或实现了抽象享元类。
 并不是所有的抽象享元类的子类都需要被共享，不能被共享的子类可设计为非共享具体享元类。
 * Created by Lin.XiChun on 2018/10/25.
 */
public class UnsharedConcreteFlyweight implements Flyweight{

    private String allState;

    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
    }

    @Override
    public void operation(String extrinsicState) {

    }
}
