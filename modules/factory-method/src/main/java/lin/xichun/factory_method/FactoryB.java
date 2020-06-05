package lin.xichun.factory_method;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
public class FactoryB implements IFactory{

    IProduct productB;
    public FactoryB()
    {
        this.productB = new ProductB();
    }

    @Override
    public IProduct getProduct() {
        // TODO Auto-generated method stub
        return this.productB;
    }

}
