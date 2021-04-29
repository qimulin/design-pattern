package lin.xichun.visitor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 对象结构
 * 访问者可以遍历对象结构中的每个元素，并且每个元素里面要实现一个accept的方法，接受访问者访问
 * Created by Lin.XiChun on 2018/11/27.
 */
public class ObjectStructure {
    private ArrayList<Element> list = new ArrayList<Element>(); // 定义一个集合用于存储元素对象

    public void accept(Visitor visitor) {
        Iterator i = list.iterator();

        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor); // 遍历访问集合中的每一个元素
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }

    public void removeElement(Element element) {
        list.remove(element);
    }

}
