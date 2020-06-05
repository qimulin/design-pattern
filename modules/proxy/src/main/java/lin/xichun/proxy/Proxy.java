package lin.xichun.proxy;

/**
 * 代理类
 继承抽象主题角色。
 包含了对真实主题的引用，在任何时候都可以操作真实主题对象。
 在代理主题角色中提供一个与真实主题角色相同的接口，以便在任何时候都可以替代真实主题。
 代理主题角色还可以控制对真实主题的使用，负责在需要的时候创建和删除真实主题对象，并对真实主题对象的使用加以约束
 * Created by Lin.XiChun on 2018/10/25.
 */
public class Proxy extends Subject {
    private RealSubject realSubject = new RealSubject();

    public void preRequest() {
        // 业务方法具体实现代码
        System.out.println("Proxy.preRequest()");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        afterRequest();
    }

    public void afterRequest() {
        // 业务方法具体实现代码
        System.out.println("Proxy.afterRequest()");
    }
}
