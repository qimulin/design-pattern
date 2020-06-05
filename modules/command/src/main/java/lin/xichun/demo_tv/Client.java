package lin.xichun.demo_tv;

/**
 * Created by Lin.XiChun on 2018/11/19.
 */
public class Client {
    public static void main(String[] args) {
        Television television = new Television();
        OpenTVCommand openTVCommand = new OpenTVCommand(television);
        Invoker invoker = new Invoker(openTVCommand);
        invoker.call();

        CloseTVCommand closeTVCommand = new CloseTVCommand(television);
        invoker = new Invoker(closeTVCommand);
        invoker.call();
    }
}
