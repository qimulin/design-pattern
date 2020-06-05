package lin.xichun.adapter.clazz;

/**
 * Created by Lin.XiChun on 2018/10/22.
 */
public class Adapter2 extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
        System.out.println("Adapter2");
    }
}
