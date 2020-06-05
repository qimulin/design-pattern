package lin.xichun.listener.java_listener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class WashingHandsListener implements Listener{
    @Override   // 监听器中有针对事件的方法
    public void fireAfterEventInvoked(Event event) {
        WashingHandsEvent washingHandsEvent = (WashingHandsEvent) event;
        System.out.println("饭前准备"+ washingHandsEvent.getEventName());
    }
}
