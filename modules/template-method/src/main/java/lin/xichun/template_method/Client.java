package lin.xichun.template_method;

/**
 * Created by Lin.XiChun on 2018/11/26.
 */
public class Client {
    public static void main(String[] args) {
        // 声明抽象类
        AbstractClass c;

        // 用ConcreteClassA实例化c
        c = new ConcreteClassA();
        c.templateMethod();

        System.out.println("-----------");

        // 用ConcreteClassB实例化c
        c = new ConcreteClassB();
        c.templateMethod();

    }

}
