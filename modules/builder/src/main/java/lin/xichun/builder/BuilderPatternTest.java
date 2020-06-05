package lin.xichun.builder;

/**
 * Created by Lin.XiChun on 2018/10/22.
 * 自解：
 * Director指挥者决定产品的制造者ConcreteBuilder，指挥者也已经定义好所需要产品的哪些属性
 * 产品的属性始终是那样的，但是制造者ConcreteBuilder不同，会使产品的属性细节不一样
 * 比喻自解：
 * Product：产品
 * Builder：抽象建造者类，抽象定义产品的（构建）组成和生成方式
 * Director：决定产品的组装，属性中只有抽象构造者
 * ConcreteBuilder：具体的构建者，实现产品的细节会不同
 *
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        /**
         * 在客户端代码中，无须关心产品对象的具体组装过程，只需确定具体建造者的类型即可，
         * 建造者模式将复杂对象的构建与对象的表现分离开来，这样使得同样的构建过程可以创建出不同的表现。
         * */
        ConcreteBuilder concreteBuilder= new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        Product product = director.construct();
        System.out.println(product.toString());

        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        director = new Director(concreteBuilder2);
        product = director.construct();
        System.out.println(product.toString());
    }
}
