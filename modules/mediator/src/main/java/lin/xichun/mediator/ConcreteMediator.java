package lin.xichun.mediator;

import org.springframework.util.StringUtils;

import java.util.Iterator;
import java.util.Map;

/**
 * 具体中介者
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteMediator extends Mediator {


    @Override
    public void toMediatorSend(String myId) {
        if(StringUtils.isEmpty(myId))
            return;

        // 使用迭代器循环Map
        Iterator<Map.Entry<String,Colleague>> it=this.colleagues.entrySet().iterator();
        while (it.hasNext()){
            // 遍历map，遇到不是myId的发送
            Map.Entry<String,Colleague> entry=it.next();
            if(!myId.equals(entry.getKey())){
                entry.getValue().receive(myId);
            }

        }
    }
}
