package lin.xichun.group_chat;

/**
 * Created by Lin.XiChun on 2018/11/23.
 */
public abstract class Colleague {
    protected Mediator mediator; // 维持一个抽象中介者的引用

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // 群发消息
    public void sendmsg(String str) {
        System.out.println(this.getClass().getSimpleName().toString() + " sendmsg:\n" + str);
        mediator.operation(this, str);
    }

    // 两人对话
    public void sendmsg(String key, String str) {
        System.out.println(this.getClass().getSimpleName().toString() + " sendmsg to " + key + ":\n" + str);
        mediator.operation(this, key, str);
    }
    //接收消息
    public void receivemsg(Colleague colleague, String str) {
        System.out.println(this.getClass().getSimpleName().toString() + " receivemsg:\n"
                + colleague.getClass().getSimpleName() + ":" + str);
    }
}

