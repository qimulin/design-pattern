package lin.xichun.bridge.demo;

/**
 * Created by Lin.XiChun on 2018/10/24.
 * 自解：
 * 形状Shape作为一个物体的主体，被抽象成一个抽象类
 * 颜色IColor作为一个物体的补充，或者说渲染，抽象成一个接口
 * 因此Shape中便有属性iColor
 * 先用抽象类产生物体的形状，然后再给其填充颜色
 * 将抽象化(Abstraction)与实现化(Implementation)脱耦
 */
public class Client {
    public static void main(String[] args) {

        Shape shape = new Circle();
        shape.iColor = new Red();
        shape.draw(shape);

        shape = new Tirangle();
        shape.iColor = new Green();
        shape.draw(shape);
    }
}
