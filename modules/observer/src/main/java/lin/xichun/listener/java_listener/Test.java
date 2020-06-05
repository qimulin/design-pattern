package lin.xichun.listener.java_listener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class Test {
    public static void main(String[] args) {
        Kid xiaoming = new Kid("xiaoming");
        // 事件源添加监听器
        xiaoming.addListener(new WashingHandsListener());
        xiaoming.eat();
    }
}
