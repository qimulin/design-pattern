package lin.xichun.simple_factory;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class ProductA implements IProduct {
    @Override
    public void productName() {
        System.out.println("生产product A");
    }
}
