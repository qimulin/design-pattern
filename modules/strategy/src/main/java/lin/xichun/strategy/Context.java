package lin.xichun.strategy;

/**
 * 环境类
 * Created by Lin.XiChun on 2018/11/26.
 */
public class Context {
    // 维持一个对抽象策略类的引用
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 调用策略类
    public void algorithm() {
        strategy.algorithm();
    }
}
