package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//格力的工厂，生产格力的产品族
public class GreeFactry implements IFactory {
    public IAirCondition CreateAirCondition() {
        return new GreeAirCondition(); // 格力的工厂生产格力的空调
    }

    public IFridge CreateFridge() {
        return new GreeFridge(); // 格力的工厂生产格力的冰箱
    }

}
