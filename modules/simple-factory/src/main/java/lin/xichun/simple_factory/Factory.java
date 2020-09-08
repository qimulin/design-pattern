package lin.xichun.simple_factory;

/**
 * @author lin.xc
 * @date 2020/9/8
 **/
public class Factory {
    public IProduct create(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
