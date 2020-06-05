package lin.xichun.command;

/**
 * 客户端类
 * Created by Lin.XiChun on 2018/11/19.
 * 【自解】：
 * 定义一个接收者
 * 定义一个命令（为命令加载接收者），命令类有固定的excute方法
 * 定义一个执行类，把命令给予执行类，
 * 执行类，固定的call方法
 */
public class Client {
    public static void main(String[] args) {
        Receiver pReceiver = new Receiver();
        ConcreteCommand pCommand = new ConcreteCommand(pReceiver);
        Invoker pInvoker = new Invoker(pCommand);
        pInvoker.call();
    }
}
