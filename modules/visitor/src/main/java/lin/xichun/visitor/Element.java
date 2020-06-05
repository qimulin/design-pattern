package lin.xichun.visitor;

/**
 * 抽象元素
 * Created by Lin.XiChun on 2018/11/27.
 对于元素类而言，在其中定义了一个accept()方法，用于接受访问者的访问
 该方法传入了一个抽象访问者Visitor类型的参数，即针对抽象访问者进行编程，而不是具体访问者，
    在程序运行时再确定具体访问者的类型，并调用具体访问者对象的visit()方法实现对元素对象的操作。
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
