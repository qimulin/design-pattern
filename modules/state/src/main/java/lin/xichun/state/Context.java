package lin.xichun.state;

/**
 * 环境类
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Context {
    private State state; // 维持一个对抽象状态对象的引用
    // 设置状态对象

    public void setState(State state) {
        this.state = state;
    }

    // 转换状态。这里是不遵守“开闭原则的部分”。要新增新的状态，必须要修改这里的代码。
    public void changeValue(int value) {
        // 判断属性值，根据属性值进行状态转换
        if (value == 0) {
            this.setState(new ConcreteStateA());
        } else if (value == 1) {
            this.setState(new ConcreteStateB());
        }
    }

    public void request() {
        // 其他代码
        state.handle(this); // 调用状态对象的业务方法
        // 其他代码
    }
}
