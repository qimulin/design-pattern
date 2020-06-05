package lin.xichun.observer_spring.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Lin.XiChun on 2018/11/15.
 * 定义一个无序的事件监听器：库存服务监听器
 */
@Component
public class StockPaymentStatusUpdateListener  implements ApplicationListener<PaymentStatusUpdateEvent> {

    @Async
    @Override
    public void onApplicationEvent(PaymentStatusUpdateEvent event) {
        System.out.println("库存服务, 收到支付状态更新的事件. " + event + " - Thread: " + Thread.currentThread().getName());
    }
}
/**
 定义事件监听器。为了满足各类场景的需求，伟大的Spring提供多种定义事件监听器。
    有序事件监听器：当多个监听器共同监听同一个事件时，该类是监听器可以按照事先定义好的顺序先后执行监听器，达到不同的监听器有序执行的目的。
    无序事件监听器：多个事件监听器听共同监听同一个监听器时，事件被触发后无法保证这些事件监听器的执行顺序。
 * */
