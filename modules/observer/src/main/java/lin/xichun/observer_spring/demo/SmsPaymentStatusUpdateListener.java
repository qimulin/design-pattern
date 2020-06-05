package lin.xichun.observer_spring.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Lin.XiChun on 2018/11/15.
 * 有序监听器：短信服务监听器
 */
@Component
public class SmsPaymentStatusUpdateListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == PaymentStatusUpdateEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == PaymentInfo.class;
    }

    @Async
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("短信服务, 收到支付状态更新的通知. " + event+ " - Thread: " + Thread.currentThread().getName());
    }

    // 排序
    @Override
    public int getOrder() {
        return 2;
    }
}

