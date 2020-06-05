package lin.xichun.observer;

/**
 * 抽象观察者
 * Created by Lin.XiChun on 2018/11/15.
 */
interface Observer {
    // 声明响应方法
    public void update(Subject sub);
}