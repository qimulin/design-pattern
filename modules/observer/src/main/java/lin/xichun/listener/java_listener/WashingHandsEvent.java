package lin.xichun.listener.java_listener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class WashingHandsEvent extends Event{
    private String eventName;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public WashingHandsEvent(Object source,String eventName) {
        super(source);
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
