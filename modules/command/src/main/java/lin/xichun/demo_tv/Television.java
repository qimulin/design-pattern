package lin.xichun.demo_tv;

/**
 * 接收者（有具体的方法实现）
 * Created by Lin.XiChun on 2018/11/19.
 */
public class Television {
    public void trunOn() {
        // 处理请求，实现具体的业务操作
        System.out.println("Television.trunOn(),电视打开了");
    }

    public void trunOff() {
        // 处理请求，实现具体的业务操作
        System.out.println("Television.trunOff(),电视关闭了");
    }

}
