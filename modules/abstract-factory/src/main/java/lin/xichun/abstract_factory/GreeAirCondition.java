package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//格力的空调
public class GreeAirCondition implements IAirCondition{
    // 格力空调的action和property
    @Override
    public void cooling() {
        System.out.println("格力空调制冷");
    }
}
