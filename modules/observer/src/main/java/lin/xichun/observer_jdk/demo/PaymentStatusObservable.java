package lin.xichun.observer_jdk.demo;

import java.util.Observable;

/**
 * 被观察者
 * Created by Lin.XiChun on 2018/11/15.
 * 支付服务类
 * 支付状态变更做为一个可观察者
 */
public class PaymentStatusObservable extends Observable {

    public void updatePaymentStatus(int newStatus) {
        // 业务逻辑操作
        System.out.println("更新新的支付状态为：" + newStatus);

        // 通知观察者
        this.setChanged();//需要调用一下这这方法，表示被观察者的状态已发生变更，Observable才会通知观察者
        this.notifyObservers();
    }
}
