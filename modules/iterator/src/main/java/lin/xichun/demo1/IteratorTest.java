package lin.xichun.demo1;

/**
 * Created by Lin.XiChun on 2018/11/22.
 */
public class IteratorTest {
    public static void main(String[] args) {

        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        aggregate.add("d");
        Iterator it=aggregate.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
