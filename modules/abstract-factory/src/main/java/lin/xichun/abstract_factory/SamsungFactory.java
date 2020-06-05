package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//三星的工厂，生产三星的产品族
public class SamsungFactory implements IFactory {

    public IAirCondition CreateAirCondition() {
        return new SamsungAirCondition(); // 三星的工厂生产三星的空调

    }

    public IFridge CreateFridge() {
        return new SamsungFridge(); // 三星的工厂生产三星的冰箱
    }
}
