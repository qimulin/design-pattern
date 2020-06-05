package lin.xichun.visitor;

/**
 * Created by Lin.XiChun on 2018/11/27.
 抽象访问者定义了访问元素对象的方法，通常为每一种类型的元素对象都提供一个访问方法，而具体访问者可以实现这些访问方法。
 这些访问方法的命名一般有两种方式：一种是直接在方法名中标明待访问元素对象的具体类型，如visitElementA(ElementA elementA)，还有一种是统一取名为visit()，通过参数类型的不同来定义一系列重载的visit()方法。
 如果所有的访问者对某一类型的元素的访问操作都相同，则可以将操作代码移到抽象访问者类中，
 */
public interface Visitor {
    public void visitConcreteElementA(ConcreteElementA cea);

    public void visitConcreteElementB(ConcreteElementB ceb);
}
