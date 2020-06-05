package lin.xichun.observer_spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Lin.XiChun on 2018/11/15.
 */
@Service
public class PaymentService {

    @Autowired
    ApplicationContext applicationContext;

    public void pay(int newStatus, String msg) {
        PaymentInfo paymentInfo = new PaymentInfo(newStatus, msg);
        applicationContext.publishEvent(new PaymentStatusUpdateEvent(paymentInfo));
    }
}
