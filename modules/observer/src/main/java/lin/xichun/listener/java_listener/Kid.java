package lin.xichun.listener.java_listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lin.XiChun on 2019-01-03.
 */
public class Kid {
    private String name;
    private List<Listener> liteners;

    public Kid(String name) {
        this.name = name;
        this.liteners = new ArrayList();
    }

    // 吃饭这个动作用洗手这个事件触发了监听
    public void eat(){

        for(Listener listener:liteners){
            if(listener instanceof WashingHandsListener){
                WashingHandsListener washingHandsListener = (WashingHandsListener) listener;
                washingHandsListener.fireAfterEventInvoked(new WashingHandsEvent(this,"洗手"));
            }
        }
        System.out.println("吃饭...");
    }

    public void addListener(Listener listener){
        liteners.add(listener);
    }
}
