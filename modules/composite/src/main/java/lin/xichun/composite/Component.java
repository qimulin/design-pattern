package lin.xichun.composite;

/**
 * 叶子构件和容器构件共有方法的声明和实现放在抽象构件类中，这些方法包括访问及管理它的子构件的方法，
 * 如增加子构件、删除子构件、获取子构件等。
 * 客户端针对该抽象构件类进行编程，无须知道它到底表示的是叶子还是容器，可以对其进行统一处理。
 * Created by Lin.XiChun on 2018/10/24.
 */
public abstract class Component {
    public abstract void add(Component c); //增加成员
    public abstract void remove(Component c); //删除成员
    public abstract Component getChild(int i); //获取成员
    public abstract void operation();  //业务方法
}
