package lin.xichun.singleton;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Lin.XiChun on 2018/10/17.
 */
public class TestSingletonEnum {
    public static void main(String[] args) throws InterruptedException {

        final Set<String> set = Collections.synchronizedSet(new HashSet<String>());
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Resource singleton = SingletonEnum.INSTANCE.getInstance();
                    set.add(singleton.toString());
                }
            });
        }
        Thread.sleep(1000);
        System.out.println("一共创建了" + set.size() + "个实例");
        for (String str : set) {
            System.out.println(str);
        }
        executor.shutdown();
    }

}
