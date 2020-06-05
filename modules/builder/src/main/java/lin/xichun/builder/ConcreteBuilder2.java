package lin.xichun.builder;

/**
 * Created by Lin.XiChun on 2018/10/22.
 */
public class ConcreteBuilder2 implements Builder{
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("aa");
    }

    @Override
    public void buildPartB() {
        product.setPartB("bb");
    }

    @Override
    public void buildPartC() {
        product.setPartC("cc");
    }

    @Override
    public Product getResult() {
        return product;
    }
}