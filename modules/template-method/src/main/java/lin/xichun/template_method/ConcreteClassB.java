package lin.xichun.template_method;

/**
 * 具体子类
 * Created by Lin.XiChun on 2018/11/26.
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation2() {
        System.out.println("步驟2：ConcreteClassB.primitiveOperation2()");
    }
    public void primitiveOperation3() {
        System.out.println("步驟3：ConcreteClassB.primitiveOperation3()");
    }
}
