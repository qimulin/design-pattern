package lin.xichun.observer;

/**
 * 具体目标类
 * Created by Lin.XiChun on 2018/11/15.
 */
public class ConcreteSubject extends Subject {

    // 实现通知方法
    @Override
    public void notifyObserver() {
        // 遍历观察者集合，调用每一个观察者的响应方法
        for (Object obs : observers) {
            ((Observer) obs).update(this);
        }
    }
}

