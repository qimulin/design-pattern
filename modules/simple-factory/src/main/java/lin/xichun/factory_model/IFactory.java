package lin.xichun.factory_model;

import lin.xichun.common.IProduct;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public interface IFactory {
    // 工厂的目的是为了生产产品
    public IProduct create();
}