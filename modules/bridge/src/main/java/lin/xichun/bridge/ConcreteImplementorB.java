package lin.xichun.bridge;

/**
 * Created by Lin.XiChun on 2018/10/24.
 */
public class ConcreteImplementorB implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB operationImpl");

    }

    @Override
    public void operationImpl2() {
        System.out.println("ConcreteImplementorB operationImpl1");
    }
}
