package lin.xichun.observer_spring.demo;

/**
 * Created by Lin.XiChun on 2018/11/15.
 * 支付实体类
 */
public class PaymentInfo {
    private int id;
    private String stauts;

    public PaymentInfo(int id, String stauts) {
        this.id = id;
        this.stauts = stauts;
    }
    // setter getter ....

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "id=" + id +
                ", stauts='" + stauts + '\'' +
                '}';
    }
}
