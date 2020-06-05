package lin.xichun.listener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 * 定义事件发生后，监听器的动作，在这里是提醒洗手。
 * 注意，监听器主要封装了动作，仅此而已。
 */
public class RemindListener {
    public void remind(RemindWashingHandsEvent remindWashingHandsEvent){
        System.out.println("listen to mom, washing hands before eating...");
    }
}
