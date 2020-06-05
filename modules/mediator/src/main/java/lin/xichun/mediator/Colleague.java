package lin.xichun.mediator;

/**
 * 抽象同事类
 * Created by Lin.XiChun on 2018/11/23.
 */
public abstract class Colleague {

    private String cid; // 作为主标识
    protected Mediator mediator;

    public String getCid() {
        return cid;
    }

    public Colleague(String cid) {
        this.cid = cid;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 发送方法
     * */
    public abstract void send();

    /**
     * 接收方法
     * */
    public abstract void receive(String fromId);

}
