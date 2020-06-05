package lin.xichun.observer_javabean.domo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 事件监听器（相当于观察者）
 * Created by Lin.XiChun on 2018/11/15.
 * 支付状态变更的监听器
 */
public class PaymentStatusUpdateListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("支付状态变更. eventName : %s, oldValue : %s, newValue : %s", evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
    }
}

