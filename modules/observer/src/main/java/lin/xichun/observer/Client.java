package lin.xichun.observer;

/**
 * 测试类
 * Created by Lin.XiChun on 2018/11/15.
 * 本例子，目标类将观察者类作为值加入自己的属性中，通知的时候去循环通知。
 */
public class Client {
    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        Observer objA = new ConcreteObserver("A");
        Observer objB = new ConcreteObserver("B");
        subject.attach(objA);
        subject.attach(objB);

        subject.setSubjectState(1);
        subject.notifyObserver();

        subject.detach(objB);
        subject.setSubjectState(2);
        subject.notifyObserver();
    }
}
