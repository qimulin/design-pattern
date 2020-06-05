package lin.xichun.listener;

/**
 * Created by Lin.XiChun on 2019-01-03.
 * 定义一个熊孩子。熊孩子就是被监听的对象，是事件源，一切事件都是事件源发出
 */
public class Child {
    private String name;
    private RemindListener remindListener;

    public Child(String name){
        this.name = name;
    }
    public void eat() {
        if(null!=remindListener){
            remindListener.remind(new RemindWashingHandsEvent(this));
        }
        System.out.println("Child eat...");
    }

    public void addListener(RemindListener listener){
        remindListener = listener;
    }
}
