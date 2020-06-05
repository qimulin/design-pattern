package lin.xichun.demo1;

/**
 * 操作聚合类的迭代
 * Created by Lin.XiChun on 2018/11/22.
 */
public class ConcreteIterator implements Iterator {
    private Aggregate aggregate = null;
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        super();
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if (index >= aggregate.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = aggregate.get(index);
        index++;
        return object;
    }
}
