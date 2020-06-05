package lin.xichun.group_chat;

/**
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者
        ConcreteMediator cm = new ConcreteMediator();
        //创建同事
        ConcreteColleagueA cca = new ConcreteColleagueA(cm);
        ConcreteColleagueB ccb = new ConcreteColleagueB(cm);
        ConcreteColleagueC ccc = new ConcreteColleagueC(cm);
        //注册同事进中介者
        cm.register("cca", cca);
        cm.register("ccb", ccb);
        cm.register("ccc", ccc);
        // 群发消息
        cca.sendmsg("Hello,I'm A");
        System.out.println("----------------------------");
        // 两个对象之间的通话
        cca.sendmsg("ccb", "Hello,I'm A");
    }

}
