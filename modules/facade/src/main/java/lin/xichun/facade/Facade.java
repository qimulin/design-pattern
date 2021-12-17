package lin.xichun.facade;

/**
 * 外观角色
 * Created by Lin.XiChun on 2018/10/25.
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void operationA() {
        subSystemA.operationA();
    }

    public void operationB() {
        subSystemB.operationB();
    }

    public void operationC() {
        subSystemC.operationC();
    }

}
