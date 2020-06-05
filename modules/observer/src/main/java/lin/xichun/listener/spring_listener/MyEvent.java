package lin.xichun.listener.spring_listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class MyEvent extends ApplicationEvent {

    private String myEventName;

    public MyEvent(Object source) {
        super(source);
        this.myEventName = source.toString();
        System.out.println("你给本事件设置的名字为"+this.myEventName);
    }

    public String getMyEventName() {
        return myEventName;
    }
}
