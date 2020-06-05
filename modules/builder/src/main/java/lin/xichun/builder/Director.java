package lin.xichun.builder;

/**
 * Created by Lin.XiChun on 2018/10/22.
 * 指挥者，负责复杂对象各个part的建造次序。
 * 与Builder之间存在关联关系，调用Builder方法完成复杂对象的建造。
 * 一般客户端只需要与Director交互。
 * 【注意】如果只有一个具体建造者，那么指挥者都可以省略。
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
