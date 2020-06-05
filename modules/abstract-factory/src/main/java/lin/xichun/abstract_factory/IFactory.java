package lin.xichun.abstract_factory;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
//工厂接口，即抽象工厂
interface IFactory {
    IFridge CreateFridge();
    IAirCondition CreateAirCondition();
}
