package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//三星的空调
public class SamsungAirCondition implements IAirCondition{

    // 三星空调的action和property
    @Override
    public void cooling() {
        System.out.println("三星空调制冷");
    }
}