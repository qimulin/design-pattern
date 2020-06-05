package lin.xichun.factory_method;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
public class FactoryA implements IFactory{

    IProduct productA;
    public FactoryA()
    {
        this.productA = new ProductA();
    }

    @Override
    public IProduct getProduct() {
        // TODO Auto-generated method stub
        return this.productA;
    }

}
