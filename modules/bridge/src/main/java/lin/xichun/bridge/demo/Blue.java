package lin.xichun.bridge.demo;

/**
 * Created by Lin.XiChun on 2018/10/24.
 */
public class Blue implements IColor {

    @Override
    public void fillColor(Shape shape) {
        System.out.println("draw blue " + shape.getClass().getSimpleName());
    }

}
