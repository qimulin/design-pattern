package lin.xichun.facade;

/**
 * 不让你直接访问某些对象，通过包一层外观
 * Created by Lin.XiChun on 2018/10/25.
 */
public class Client {

    public static void main(String[] args) {
        // 当没有门面模式的时候，我们需要和A、B、C三个子系统打交道的时候，就得分别new出来，去操作，就像下面代码的写法一样
       /*
        SubSystemA subSystemA = new SubSystemA();
        subSystemA.operationA();
        SubSystemB subSystemB = new SubSystemB();
        subSystemB.operationB();
        SubSystemC subSystemC = new SubSystemC();
        subSystemC.operationC();*/

       // 有了门面之后，我们直接和门面打交道即可，门面会自行和具体的子系统去沟通
        Facade facade = new Facade();
        facade.operationA();
        facade.operationB();
        facade.operationC();
    }

}
