package lin.xichun.facade;

/**
 * 不让你直接访问某些对象，通过包一层外观
 * Created by Lin.XiChun on 2018/10/25.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operationA();
        facade.operationB();
    }

}
