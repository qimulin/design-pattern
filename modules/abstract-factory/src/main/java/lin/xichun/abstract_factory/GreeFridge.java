package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//格力的冰箱
public class GreeFridge implements IFridge {
    // 格力冰箱的action和property
    @Override
    public void store() {
        System.out.println("格力冰箱储存");
    }
}
