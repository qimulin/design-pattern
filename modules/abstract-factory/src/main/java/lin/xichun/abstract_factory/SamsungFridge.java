package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//三星的冰箱
public class SamsungFridge implements IFridge {
    // 三星冰箱的action和property
    @Override
    public void store() {
        System.out.println("三星冰箱储存");
    }
}
