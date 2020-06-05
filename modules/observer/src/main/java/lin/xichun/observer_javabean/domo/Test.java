package lin.xichun.observer_javabean.domo;

/**
 * JavaBean中事件驱动
 * Created by Lin.XiChun on 2018/11/15.
 * 测试JDK提供的PropertyChangeEvent
 */
public class Test {
    public static void main(String[] args) {
        // 定义被监听者
        PaymentStatusUpdateBean paymentStatusUpdateBean = new PaymentStatusUpdateBean();

        // 添加监听器
        paymentStatusUpdateBean.addPropertyChangeListener(new PaymentStatusUpdateListener());

        // 更新支付状态
        paymentStatusUpdateBean.updateStatus(3);
    }
}
