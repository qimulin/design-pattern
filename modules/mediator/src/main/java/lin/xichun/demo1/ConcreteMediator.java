package lin.xichun.demo1;

/**
 * 具体中介者
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteMediator extends Mediator {

    // 实现业务方法，封装同事之间的联系与调用。根据具体需求编写代码
    public void operation() {
        // ......
        ((Colleague) (colleagues.get(1))).receivemsg(); // 通过中介者调用同事类的方法
        // ......
    }
}
