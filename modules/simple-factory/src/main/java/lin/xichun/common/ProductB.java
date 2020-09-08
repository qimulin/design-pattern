package lin.xichun.common;

import lin.xichun.common.IProduct;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class ProductB implements IProduct {
    @Override
    public void productName() {
        System.out.println("生产product B");
    }
}
