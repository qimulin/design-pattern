package lin.xichun.memento;

/**
 * 原发器
 * 基本上字段和备忘录一样，但是多了备忘录创建和备忘录恢复
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录对象
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 根据备忘录对象恢复原发器
    public void restoreMemento(Memento memento) {
        // 自解：相当于备忘录记了状态，想要恢复需要从备忘录里面取状态
        this.setState(memento.getState());
    }

}
