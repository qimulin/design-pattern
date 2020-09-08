package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
public class Client {
    public static void main(String[] args) {
        // 格力工厂生产的冰箱和空调
        GreeFactory greeFactory = new GreeFactory();
        greeFactory.CreateFridge().store();
        greeFactory.CreateAirCondition().cooling();
        // 三星工厂生产的冰箱和空调
        SamsungFactory samsungFactory = new SamsungFactory();
        samsungFactory.CreateFridge().store();
        samsungFactory.CreateAirCondition().cooling();
    }
}
