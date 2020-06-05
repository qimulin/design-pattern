package lin.xichun.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 建筑工厂类
 * Created by Lin.XiChun on 2018/11/23.
 */
public class JianZhuFactory {

    private static final Map<String,TiYuGuan> tygs = new HashMap<String,TiYuGuan>();

    public static TiYuGuan getTyg(String yundong){
        // 这波操作怎么感觉这么像连接池，存在享元则返回，不存在则实例化一个
        TiYuGuan tyg = tygs.get(yundong);
        if(tyg == null){
            tyg = new TiYuGuan(yundong);
            tygs.put(yundong,tyg);
        }
        return tyg;
    }

    public static int getSize(){
        return tygs.size();
    }
}
