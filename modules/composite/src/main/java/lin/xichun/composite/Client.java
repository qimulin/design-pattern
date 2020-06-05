package lin.xichun.composite;

/**
 * Created by Lin.XiChun on 2018/10/24.
 * 自解：
 * Leaf需要继承抽象的抽象构建Component，不仅是Leaf，凡是这种有增、删、查子节点的属性的都可以继承这个构建容器
 * 这样可以扩展出很多层的结构
 */
public class Client {
    public static void main(String[] args) {
        Component leaf = new Leaf();
        leaf.add(leaf); // 会打印ERROR，直接使用leaf.add不允许，因为它为最后一层
        leaf.operation();

        Component composite = new Composite();
        composite.add(leaf);    // 前面可以都用Composite装很多层，直至最后一层再用leaf
        composite.operation();
    }
}
