package lin.xichun.observer_spring.demo;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Lin.XiChun on 2018/11/15.
 *  支付状态更新事件
 */
public class PaymentStatusUpdateEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public PaymentStatusUpdateEvent(PaymentInfo source) {
        super(source);
    }

}
