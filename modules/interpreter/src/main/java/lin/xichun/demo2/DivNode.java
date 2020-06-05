package lin.xichun.demo2;

/**
 * Created by Lin.XiChun on 2018/11/22.
 */
public class DivNode extends SymbolNode
{
    public DivNode(Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return super.left.interpret() / super.right.interpret();
    }
}
