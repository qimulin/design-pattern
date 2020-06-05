package lin.xichun.memento;

/**
 * 备忘录
 * Created by Lin.XiChun on 2018/11/23.
 * 本例子备忘录只备份“状态”state这个字段
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
