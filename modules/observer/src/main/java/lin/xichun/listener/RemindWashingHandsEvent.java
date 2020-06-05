package lin.xichun.listener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 * 事件对象，包装了事件源。我们在这里定义一个饭前洗手事件。
 * 事件对象定义了事件的属性、状态。
 */
public class RemindWashingHandsEvent {
    private Child child;

    public RemindWashingHandsEvent(Child child){
        this.child = child;
    }
}
