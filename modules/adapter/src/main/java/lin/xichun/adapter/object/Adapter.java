package lin.xichun.adapter.object;

/**
 * Created by Lin.XiChun on 2018/10/22.
 */
public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
