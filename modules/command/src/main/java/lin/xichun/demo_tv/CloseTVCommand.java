package lin.xichun.demo_tv;

/**
 * 具体命令类-关闭电视的命令
 * Created by Lin.XiChun on 2018/11/19.
 */
public class CloseTVCommand extends Command {
    private Television television; // 维持一个对请求接收者对象的引用

    public CloseTVCommand(Television television) {
        super();
        this.television = television;
    }

    public void execute() {
        television.trunOff();
    }
}
