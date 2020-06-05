package lin.xichun.Iterator;

/**
 * Created by Lin.XiChun on 2018/11/22.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        ConcreteIterator iterator = aggregate.createIterator();
        iterator.first();
    }
}
