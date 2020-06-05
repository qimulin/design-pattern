package lin.xichun.demo_tv;

/**
 * 具体命令类-打开电视的命令
 * Created by Lin.XiChun on 2018/11/19.
 */
public class OpenTVCommand extends Command {
    private Television television; // 维持一个对请求接收者对象的引用

    public OpenTVCommand(Television television) {
        super();
        this.television = television;
    }

    public void execute() {
        television.trunOn();
    }
}
