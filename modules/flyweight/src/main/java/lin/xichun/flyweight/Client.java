package lin.xichun.flyweight;

/**
 * Created by Lin.XiChun on 2018/10/25.
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fw = factory.getFlyweight("1");
        System.out.println(fw.toString());
        Flyweight fw2 = factory.getFlyweight("2");
        System.out.println(fw2.toString());
        Flyweight fw3 = factory.getFlyweight("1");
        System.out.println(fw3.toString());
    }
}
