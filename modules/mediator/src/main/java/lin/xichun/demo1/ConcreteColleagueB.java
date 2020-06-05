package lin.xichun.demo1;

/**
 * 具体同事类B
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receivemsg() {
        // 根据具体需求编写代码
        System.out.println("ConcreteColleagueB receivemsg!");
    }
}

