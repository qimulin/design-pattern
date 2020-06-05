package lin.xichun.demo1;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者
 * Created by Lin.XiChun on 2018/11/23.
 */
abstract class Mediator {

    // 用于存储同事对象。不一定是ArrayList类型，什么类型根据具体需求定。
    protected List<Colleague> colleagues = new ArrayList<>();

    // 注册方法，用于增加同事对象
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    // 声明抽象的业务方法，供同事对象调用
    public abstract void operation();
}

