package lin.xichun.observer_javabean.domo;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
/**
 * 事件源（相当于被观察者）
 * Created by Lin.XiChun on 2018/11/15.
 */
public class PaymentStatusUpdateBean {
    PropertyChangeSupport paymentlisteners = new PropertyChangeSupport(this);

    public void updateStatus(int newStatus) {
        // 模拟业务逻辑
        System.out.println("支付状态更新： " + newStatus);
        // 用firePropertyChange方法触发通知
        paymentlisteners.firePropertyChange("paymentStatuUpdate", 0, newStatus);        ;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        paymentlisteners.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        paymentlisteners.addPropertyChangeListener(listener);
    }
}
