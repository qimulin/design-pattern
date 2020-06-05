package lin.xichun.builder;

/**
 * Concrete【单词释义】具体的
 * Created by Lin.XiChun on 2018/10/22.
 * 具体建造者，实现了或继承了Builder的类。
 * （自解：具体去实现Builder的两类方法）
 * 实现buildPartX()，用于创建Product对象的某个part；
 * 实现getResult()，装配part，用于返回一个完整的Product对象。
 */
public class ConcreteBuilder implements Builder{
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C");
    }

    @Override
    public Product getResult() {
        return product;
    }

    // 当然，这里construct方法也可以重写
}
