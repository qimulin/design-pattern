package lin.xichun.memento;

/**
 * 管理者
 * 可以管理备忘录
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
