package lin.xichun.observer_spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lin.XiChun on 2018/11/15.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");
        // 注意：spring2.xml对应各个Listener的@Async注解
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        PaymentService paymentService = applicationContext.getBean(PaymentService.class);
        paymentService.pay(1, "支付成功");
    }

}
