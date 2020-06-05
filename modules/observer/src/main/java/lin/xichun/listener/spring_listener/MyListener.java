package lin.xichun.listener.spring_listener;

import org.springframework.context.ApplicationListener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class MyListener implements ApplicationListener<MyEvent>{

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("监听到了事件："+myEvent.getMyEventName());
        // 执行其他操作
    }
}
