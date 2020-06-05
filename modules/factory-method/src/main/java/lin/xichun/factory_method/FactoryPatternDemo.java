package lin.xichun.factory_method;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        FactoryA productFactoryA = new FactoryA();
        FactoryB productFactoryB = new FactoryB();

        IProduct productA = productFactoryA.getProduct();
        productA.get();
        IProduct productB = productFactoryB.getProduct();
        productB.get();
    }
}
