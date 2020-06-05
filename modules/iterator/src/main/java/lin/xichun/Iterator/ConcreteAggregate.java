package lin.xichun.Iterator;

/**
 * 具体聚合类
 * Created by Lin.XiChun on 2018/11/22.
 */
public class ConcreteAggregate implements Aggregate {

    //在这里，根据实际情况定义要存储的数据
    public ConcreteIterator createIterator() {
        return new ConcreteIterator(this);
    }
}
