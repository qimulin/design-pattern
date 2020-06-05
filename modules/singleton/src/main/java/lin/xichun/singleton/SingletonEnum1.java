package lin.xichun.singleton;

/**
 * Created by Lin.XiChun on 2018/10/17.
 */
class Resource1{

}

public enum SingletonEnum1{
    INSTANCE;
    private Resource instance;
    SingletonEnum1() {
        instance = new Resource();
    }
    public Resource getInstance() {
        return instance;
    }
}
