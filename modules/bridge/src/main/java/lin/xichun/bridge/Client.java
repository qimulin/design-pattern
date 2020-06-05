package lin.xichun.bridge;

/**
 * Created by Lin.XiChun on 2018/10/24.
 * 自解比喻：
 * Implementor 机器人行为接口和抽象方法operationImpl（比喻成速度1的抽象走路方法）和operationImpl2（比喻成速度2的抽象走路方法）
 * Abstraction 某抽象的产品（或者某版本）的机器人接口，有机器人行为接口属性，和定义走路接口Abstraction.operation
 * RefinedAbstraction 扩充的某抽象产品的机器人接口，要求走路接口必须调用机器人行为属性里面的operationImpl
 * ConcreteImplementorA、ConcreteImplementorB：具体实现每个走路operationImpl、operationImpl2方法，供随时转换
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.implementor = new ConcreteImplementorA();
        abstraction.operation();
        abstraction.implementor = new ConcreteImplementorB();
        abstraction.operation();
    }
}
