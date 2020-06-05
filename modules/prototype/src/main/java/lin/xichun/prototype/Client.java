package lin.xichun.prototype;

/**
 * Created by Lin.XiChun on 2018/10/22.
 * 测试类客户类
 * 比喻自解：
 * Prototype：抽象原型类，例如强制要求去实现克隆方法，比new方法更好
 * ConcretePrototype：具体原型类，没什么特别，就实现克隆方法
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 5; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
