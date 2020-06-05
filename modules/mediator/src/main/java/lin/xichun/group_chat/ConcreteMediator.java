package lin.xichun.group_chat;

/**
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteMediator extends Mediator {
    // 实现业务方法，群发消息
    public void operation(Colleague colleague, String str) {
        for (String key : colleagues.keySet()) {
            if (!(colleagues.get(key) == colleague))
                colleagues.get(key).receivemsg(colleague, str);
        }
    }

    // 实现业务方法，两人对话
    public void operation(Colleague colleague, String key, String str) {
        colleagues.get(key).receivemsg(colleague, str);
    }
}
