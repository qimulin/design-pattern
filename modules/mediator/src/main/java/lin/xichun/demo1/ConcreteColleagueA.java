package lin.xichun.demo1;

/**
 * 具体同事类A
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receivemsg() {
        // 根据具体需求编写代码
        System.out.println("ConcreteColleagueA receivemsg!");
    }
}
