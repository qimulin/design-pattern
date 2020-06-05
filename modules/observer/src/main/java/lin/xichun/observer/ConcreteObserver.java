package lin.xichun.observer;

/**
 * 具体观察者
 * Created by Lin.XiChun on 2018/11/15.
 */
public class ConcreteObserver implements Observer {

    // 观察者名称
    String name;
    // 观察者状态
    int obeserverState;

    // 构造方法
    public ConcreteObserver(String name) {
        super();
        this.name = name;
    }

    // 实现响应方法
    @Override
    public void update(Subject sub) {
        obeserverState = sub.getSubjectState();
        System.out.println("update oberserver[" + name + "] state:" + obeserverState);
    }
}
