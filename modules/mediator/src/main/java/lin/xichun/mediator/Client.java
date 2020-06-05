package lin.xichun.mediator;

/**
 * 客户端类
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        // 创建同事对象
        Colleague cca = new ConcreteColleagueA("A");
        Colleague ccb = new ConcreteColleagueB("B");
        // 注册同事对象进中介者
        mediator.register(cca);
        mediator.register(ccb);
        // 调用方法，进行同事之间的通信
        cca.send();
    }
}
