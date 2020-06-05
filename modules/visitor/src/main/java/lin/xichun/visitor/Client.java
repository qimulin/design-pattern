package lin.xichun.visitor;

import java.util.Random;

/**
 * Created by Lin.XiChun on 2018/11/27.
 * 本例子
 * 给结构对象添加元素，A元素或者B元素
 * 结构对象也也需要一个去接受访问者的方法
 */
public class Client {
    public static void main(String[] args) {
        ObjectStruture objectStruture = new ObjectStruture();

        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int a = ran.nextInt(100);
            if (a > 50) {
                objectStruture.addElement(new ConcreteElementA());
            } else {
                objectStruture.addElement(new ConcreteElementB());
            }
        }
        objectStruture.accept(new ConcreteVisitorA());
    }

}
