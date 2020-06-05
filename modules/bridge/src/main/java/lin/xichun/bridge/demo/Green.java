package lin.xichun.bridge.demo;

/**
 * Created by Lin.XiChun on 2018/10/24.
 */
public class Green implements IColor {

    @Override
    public void fillColor(Shape shape) {
        System.out.println("draw green " + shape.getClass().getSimpleName());

    }
}
