package lin.xichun.bridge.demo;

/**
 * Created by Lin.XiChun on 2018/10/24.
 */
public abstract class Shape {
    IColor iColor;

    public void draw(Shape shape) {
        iColor.fillColor(shape);
    }
}