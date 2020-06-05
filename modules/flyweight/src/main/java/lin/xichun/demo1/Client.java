package lin.xichun.demo1;

/**
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Client {
    public static void main(String[] args) {
        String yundong ="足球";
        for(int i = 1;i <= 5;i++){
            TiYuGuan tyg = JianZhuFactory.getTyg(yundong);
            tyg.setName("中国体育馆");
            tyg.setShape("圆形");
            tyg.use();
            System.out.println("对象池中对象数量为："+JianZhuFactory.getSize());
        }
    }
}
