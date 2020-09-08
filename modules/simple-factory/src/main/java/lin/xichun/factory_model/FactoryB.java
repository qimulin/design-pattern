package lin.xichun.factory_model;

import lin.xichun.common.IProduct;
import lin.xichun.common.ProductB;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class FactoryB implements IFactory{
    @Override
    public IProduct create() {
        return new ProductB();
    }
}
