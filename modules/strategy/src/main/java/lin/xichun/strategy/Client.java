package lin.xichun.strategy;

/**
 * 将策略作为一个对象设置进环境类中，
 * 环境类中执行同样的方法但是因为策略不同而结果不同
 * Created by Lin.XiChun on 2018/11/26.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        context.setStrategy(concreteStrategyA);
        context.algorithm();

        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();
        context.setStrategy(concreteStrategyB);
        context.algorithm();
    }
}
