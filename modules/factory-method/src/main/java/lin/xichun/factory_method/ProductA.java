package lin.xichun.factory_method;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
public class ProductA implements IProduct {
    @Override
    public void get() {
        System.out.println("get ProductA");
    }
}
