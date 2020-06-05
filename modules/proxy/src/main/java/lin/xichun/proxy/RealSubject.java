package lin.xichun.proxy;

/**
 * 真实主题角色
 具体类
 继承抽象主题角色。
 实现了真实的业务操作。
 * Created by Lin.XiChun on 2018/10/25.
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        // 业务方法具体实现代码
        System.out.println("RealSubject.request()");
    }
}

