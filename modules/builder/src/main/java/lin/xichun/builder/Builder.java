package lin.xichun.builder;

/**
 * Created by Lin.XiChun on 2018/10/22.
 * 抽象建造者。可以是抽象类或者接口。为创建Product对象的各个part提供抽象方法。
 * 在其中一般声明两类方法：
 * 1、buildPartX()，用于创建Product对象的某个part；（自解：定义装配每个部分的接口）
 * 2、getResult()，装配part，用于返回一个完整的Product对象。（自解：返回整个对象的接口）
 * 【注意】如果只有一个具体建造者，那么抽象建造者可以省略。
 */
public interface Builder {
    public  void buildPartA();
    public  void buildPartB();
    public  void buildPartC();
    public  Product getResult();
}
