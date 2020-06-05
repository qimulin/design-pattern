package lin.xichun.demo1;

/**
 * 可以看作就是类似一个List，但是没有遍历的职责（功能）
 * Created by Lin.XiChun on 2018/11/22.
 */
public class ConcreteAggregate implements Aggregate{
    private Object[] list;
    private int size=0;
    private int index=0;
    public ConcreteAggregate(){
        index=0;
        size=0;
        list=new Object[100];
    }
    @Override
    public void add(Object obj) {
        list[index++]=obj;
        size++;
    }

    @Override
    public Iterator iterator() {

        return new ConcreteIterator(this);
    }
    @Override
    public Object get(int index) {

        return list[index];
    }
    @Override
    public int getSize() {

        return size;
    }
}
