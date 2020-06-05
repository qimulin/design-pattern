package lin.xichun.demo1;

/**
 * 定义容器角色(Aggregate)
 * Created by Lin.XiChun on 2018/11/22.
 * 定义集合可以进行的操作
 */
public interface Aggregate {

    public void add(Object obj);

    public Object get(int index);

    public Iterator iterator();

    public int getSize();
}
