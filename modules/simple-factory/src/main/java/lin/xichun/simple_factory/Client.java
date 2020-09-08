package lin.xichun.simple_factory;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        IProduct productA = factory.create("A");
        productA.productName();

        IProduct productB = factory.create("B");
        productB.productName();
    }
}
