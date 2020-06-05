package lin.xichun.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 抽象中介者
 * Created by Lin.XiChun on 2018/11/23.
 */
abstract class Mediator {

    protected Map<String, Colleague> colleagues = new HashMap<>();

    // 注册方法，用于增加同事对象
    public void register(Colleague colleague) {
        colleagues.put(colleague.getCid(), colleague);
        colleague.setMediator(this);
    }

    // 声明抽象的业务方法，供同事对象调用（自解：交给中介者发送，发送给其他接入中介者的同事）
    public abstract void toMediatorSend(String myId);

}

