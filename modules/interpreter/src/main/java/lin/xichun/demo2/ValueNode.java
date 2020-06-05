package lin.xichun.demo2;

/**
 * 非终结表达式：ValueNode.java。主要用解释该表达式的值。
 * Created by Lin.XiChun on 2018/11/20.
 */
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value)
    {
        this.value=value;
    }

    public int interpret()
    {
        return this.value;
    }
}
