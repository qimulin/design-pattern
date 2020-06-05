package lin.xichun.group_chat;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lin.XiChun on 2018/11/23.
 */
public abstract class Mediator {
    protected Map<String, Colleague> colleagues = new HashMap<String, Colleague>(); // 用于存储同事对象

    // 注册方法，用于增加同事对象
    public void register(String str, Colleague colleague) {
        colleagues.put(str, colleague);
    }
    // 声明抽象的业务方法：群发消息
    public abstract void operation(Colleague colleague, String str);

    // 声明抽象的业务方法：两人对话
    public abstract void operation(Colleague colleague, String key, String str);

}
