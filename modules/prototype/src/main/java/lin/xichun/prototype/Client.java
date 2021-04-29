package lin.xichun.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lin.XiChun on 2018/10/22.
 * 测试类客户类
 * 比喻自解：
 * Prototype：抽象原型类，例如强制要求去实现克隆方法，比new方法更好
 * ConcretePrototype：具体原型类，没什么特别，就实现克隆方法
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype(1);
        cp.show();
        System.out.println("------------- 1 -------------");
        List<ConcretePrototype> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ConcretePrototype cloneCp = (ConcretePrototype) cp.clone();
            if(i==2){
                cloneCp.setField(2);
            }
            list.add(cloneCp);
            cloneCp.show();
        }

        ConcretePrototype firstCp = list.get(0);
        firstCp.setField(3);
        System.out.println("------------- 2 -------------");
        cp.show();
        System.out.println("------------- 3 -------------");
        for(ConcretePrototype idx: list){
            idx.show();
        }
    }
}
