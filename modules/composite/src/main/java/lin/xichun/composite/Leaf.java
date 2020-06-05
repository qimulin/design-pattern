package lin.xichun.composite;

/**
 * 叶子构件不能再包含子构件，因此在叶子构件中实现子构件管理和访问方法时需要提供异常处理或错误提示。
 * Created by Lin.XiChun on 2018/10/24.
 */
public class Leaf extends Component {
    public void add(Component c) {
        // 异常处理或错误提示
        System.out.println("ERROR:叶子节点不存在此操作");
    }

    public void remove(Component c) {
        // 异常处理或错误提示
        System.out.println("ERROR:叶子节点不存在此操作");
    }

    public Component getChild(int i) {
        // 异常处理或错误提示
        System.out.println("ERROR:叶子节点不存在此操作");
        return null;
    }

    public void operation() {
        System.out.println("Leaf.operation()");
    }
}

