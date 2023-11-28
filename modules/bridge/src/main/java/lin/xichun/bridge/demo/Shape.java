package lin.xichun.bridge.demo;

/**
 * 形状
 * Created by Lin.XiChun on 2018/10/24.
 */
public abstract class Shape {

    /** 包含颜色属性 */
    IColor iColor;

    public void draw(Shape shape) {
        iColor.fillColor(shape);
    }
}