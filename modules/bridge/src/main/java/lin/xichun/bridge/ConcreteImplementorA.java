package lin.xichun.bridge;

/**
 * Created by Lin.XiChun on 2018/10/24.
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operationImpl");

    }

    @Override
    public void operationImpl2() {
        System.out.println("ConcreteImplementorA operationImpl1");
    }

}
