package lin.xichun.observer;

import java.util.ArrayList;

/**
 * 抽象目标类
 * Created by Lin.XiChun on 2018/11/15.
 */
abstract class Subject {
    // 定义一个观察者集合用于存储所有观察者对象
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    // 观察者状态
    int subjectState;

    public int getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(int subjectState) {
        this.subjectState = subjectState;
    }

    // 注册方法，用于向观察者集合中增加一个观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 注销方法，用于在观察者集合中删除一个观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 声明抽象通知方法
    public abstract void notifyObserver();
}

