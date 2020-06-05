package lin.xichun.demo1;

/**
 * 抽象同事类
 * Created by Lin.XiChun on 2018/11/23.
 * 自解：
 * 所有同事类的发送通信都交给中介者去执行
 */
public abstract class Colleague {

    protected Mediator mediator; // 维持一个抽象中介者的引用。以供调用中介者。

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receivemsg(); // 声明方法，处理自己的行为

    // 定义依赖方法，与中介者进行通信。根据具体需求编写代码
    public void sendmsg() {
        mediator.operation();//与中介者进行通信
    }
}
