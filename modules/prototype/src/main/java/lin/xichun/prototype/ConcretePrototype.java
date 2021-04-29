package lin.xichun.prototype;

/**
 * Created by Lin.XiChun on 2018/10/22.
 * 具体原型类
 */
public class ConcretePrototype implements Prototype, Cloneable {

    private Integer field;

    public ConcretePrototype(Integer field){
        this.field = field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public ConcretePrototype clone() {
        // 使自己具有克隆的功能
        ConcretePrototype prototype = null;
        try {
            prototype = (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public void show() {
        System.out.println("ConcretePrototype:" + this.toString()+" field:"+field);
    }
}
