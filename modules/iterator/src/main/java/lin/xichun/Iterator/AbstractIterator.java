package lin.xichun.Iterator;

/**
 * 抽象迭代器
 * Created by Lin.XiChun on 2018/11/22.
 */
interface AbstractIterator {
    public void first();

    public void next();

    public boolean hasNext();

    public Object currentItem();
}
