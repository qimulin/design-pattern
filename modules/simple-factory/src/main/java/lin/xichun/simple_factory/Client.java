package lin.xichun.simple_factory;

import lin.xichun.common.IProduct;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        // 传入标识参数，内部自然能提供出你需要的对象类型
        IProduct productA = factory.create("A");
        productA.productName();

        IProduct productB = factory.create("B");
        productB.productName();
    }
}
