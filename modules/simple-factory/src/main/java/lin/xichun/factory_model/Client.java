package lin.xichun.factory_model;

import lin.xichun.common.IProduct;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class Client {
    public static void main(String[] args) {
        IFactory factoryA = new FactoryA();
        IProduct productA = factoryA.create();
        productA.productName();

        IFactory factoryB = new FactoryB();
        IProduct productB = factoryB.create();
        productB.productName();
    }
}
