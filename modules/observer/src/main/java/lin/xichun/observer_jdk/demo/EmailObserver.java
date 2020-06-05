package lin.xichun.observer_jdk.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Created by Lin.XiChun on 2018/11/15.
 * 邮件服务
 */
public class EmailObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("邮件服务收到通知");
    }
}
