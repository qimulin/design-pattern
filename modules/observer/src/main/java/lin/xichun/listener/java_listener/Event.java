package lin.xichun.listener.java_listener;

import java.util.EventObject;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class Event extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public Event(Object source) {
        super(source);
    }
}
