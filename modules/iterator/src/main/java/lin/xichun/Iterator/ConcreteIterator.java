package lin.xichun.Iterator;

/**
 * 具体迭代器
 * Created by Lin.XiChun on 2018/11/22.
 */
public class ConcreteIterator implements AbstractIterator {
    private ConcreteAggregate aggregate; // 维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据
    private int cursor; // 定义一个游标，用于记录当前访问位置

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    public void first() {
        //根据实际情况实现方法
    }

    public void next() {
        //根据实际情况实现方法

    }

    public boolean hasNext() {
        //根据实际情况实现方法
        return false;
    }

    public Object currentItem() {
        //根据实际情况实现方法
        return null;
    }

}
