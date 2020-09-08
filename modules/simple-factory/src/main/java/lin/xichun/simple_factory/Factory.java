package lin.xichun.simple_factory;

import lin.xichun.common.IProduct;
import lin.xichun.common.ProductA;
import lin.xichun.common.ProductB;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class Factory {
    public IProduct create(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
