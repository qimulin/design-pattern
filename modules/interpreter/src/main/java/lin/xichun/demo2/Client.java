package lin.xichun.demo2;

/**
 * Created by Lin.XiChun on 2018/11/22.
 */
public class Client {
    public static void main(String args[]) {
        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
