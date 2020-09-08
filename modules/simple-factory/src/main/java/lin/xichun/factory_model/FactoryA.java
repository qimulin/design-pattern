package lin.xichun.factory_model;

import lin.xichun.common.IProduct;
import lin.xichun.common.ProductA;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class FactoryA implements IFactory{
    @Override
    public IProduct create() {
        return new ProductA();
    }
}
