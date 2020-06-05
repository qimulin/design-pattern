package lin.xichun.visitor;

/**
 * Created by Lin.XiChun on 2018/11/27.
 */
public class ConcreteVisitorA implements Visitor {
    public void visitConcreteElementA(ConcreteElementA cea) {
        cea.doSomething();
    }

    public void visitConcreteElementB(ConcreteElementB ceb) {
        ceb.doSomething();
    }
}
